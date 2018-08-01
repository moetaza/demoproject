package com.example.moetaz.mvptoturial.root;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppilcationModule {

    private Application app;

    public AppilcationModule(Application app){
        this.app  = app;
    }

    @Provides
    @Singleton
     public Context provideContext(){
        return app;
     }
}
