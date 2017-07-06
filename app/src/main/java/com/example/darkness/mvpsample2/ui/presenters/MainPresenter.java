package com.example.darkness.mvpsample2.ui.presenters;

import com.example.darkness.mvpsample2.events.ErrorEvent;
import com.example.darkness.mvpsample2.events.NewPostsEvent;
import com.example.darkness.mvpsample2.model.PostsAPI;
import com.example.darkness.mvpsample2.model.pojo.Result;
import com.example.darkness.mvpsample2.ui.screen_contracts.MainScreen;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Darkness on 06-07-2017.
 */

public class MainPresenter {
    @Inject
    public MainPresenter() {
    }

    public void OnShowPostsButtonClick(MainScreen mainScreen) {
        mainScreen.launchPostsActivity();
    }


}
