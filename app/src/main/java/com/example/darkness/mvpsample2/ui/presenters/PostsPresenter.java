package com.example.darkness.mvpsample2.ui.presenters;

import com.example.darkness.mvpsample2.events.ErrorEvent;
import com.example.darkness.mvpsample2.events.NewPostsEvent;
import com.example.darkness.mvpsample2.model.PostsAPI;
import com.example.darkness.mvpsample2.model.pojo.Post;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Darkness on 06-07-2017.
 */

public class PostsPresenter {
    PostsAPI postsAPI;

    @Inject
    public PostsPresenter(PostsAPI postsAPI) {
        this.postsAPI = postsAPI;
    }

    public void loadPostsFromAPI() {
        postsAPI.getPostsObservable().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers
                .mainThread())
                .subscribe(new Subscriber<List<Post>>() {
                    @Override
                    public void onNext(List<Post> newPosts) {
                        EventBus.getDefault().post(new NewPostsEvent(newPosts));
                    }

                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        EventBus.getDefault().post(new ErrorEvent());
                    }

                });
    }
}
