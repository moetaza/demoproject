package com.example.moetaz.mvptoturial.root;

import android.app.Application;

import com.example.moetaz.mvptoturial.LoginModule;


public class App extends Application {

    private ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .appilcationModule(new AppilcationModule(this))
                .loginModule(new LoginModule())
                .build();
    }


    public ApplicationComponent getComponent() {
        return component;
    }
}
