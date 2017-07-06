package com.example.darkness.mvpsample2.model;

import com.example.darkness.mvpsample2.model.pojo.Post;
import com.example.darkness.mvpsample2.model.pojo.Result;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Darkness on 05-07-2017.
 */

public class PostsAPI {
    private interface PostService {
        @GET("posts")
        Observable<List<Post>> getPostsList();
    }

    private Observable<List<Post>> postsObservable = new Retrofit.Builder()
            .baseUrl("http://jsonplaceholder.typicode.com/")
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(PostService.class).getPostsList().cache();


    public Observable<List<Post>> getPostsObservable() {
        return postsObservable;
    }

}
