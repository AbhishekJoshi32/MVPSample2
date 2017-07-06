package com.example.darkness.mvpsample2.dagger.components;

import com.example.darkness.mvpsample2.dagger.modules.AppModule;
import com.example.darkness.mvpsample2.ui.activities.MainActivity;
import com.example.darkness.mvpsample2.ui.activities.PostsActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Darkness on 05-07-2017.
 */

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(PostsActivity activity);
}

