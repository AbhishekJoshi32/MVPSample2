package com.example.darkness.mvpsample2.dagger;

import com.example.darkness.mvpsample2.dagger.components.AppComponent;
import com.example.darkness.mvpsample2.dagger.components.DaggerAppComponent;
import com.example.darkness.mvpsample2.dagger.modules.AppModule;

/**
 * Created by Darkness on 05-07-2017.
 */

public class DaggerInjector {
    private static AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();

    public static AppComponent get() {
        return appComponent;
    }
}
