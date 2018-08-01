package com.example.moetaz.mvptoturial.root;


import com.example.moetaz.mvptoturial.LoginActivity;
import com.example.moetaz.mvptoturial.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppilcationModule.class , LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity loginActivity);
}
