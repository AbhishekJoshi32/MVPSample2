package com.example.darkness.mvpsample2.dagger.modules;

import com.example.darkness.mvpsample2.model.PostsAPI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Darkness on 05-07-2017.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    PostsAPI providePostsApi() {
        return new PostsAPI();
    }

}
