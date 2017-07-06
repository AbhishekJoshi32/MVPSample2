package com.example.darkness.mvpsample2.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.darkness.mvpsample2.R;
import com.example.darkness.mvpsample2.dagger.DaggerInjector;
import com.example.darkness.mvpsample2.events.ErrorEvent;
import com.example.darkness.mvpsample2.events.NewPostsEvent;
import com.example.darkness.mvpsample2.ui.presenters.MainPresenter;
import com.example.darkness.mvpsample2.ui.screen_contracts.MainScreen;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainScreen {

    private static final  String TAG = "Main";
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DaggerInjector.get().inject(this);
        ButterKnife.bind(this);
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.show_posts_button)
    public void onListSampleButtonClick() {
        mainPresenter.OnShowPostsButtonClick(this);
    }

    @Override
    public void launchPostsActivity() {
        Intent intent = new Intent(this, PostsActivity.class);
        startActivity(intent);
    }
}
