package com.example.moetaz.mvptoturial;


import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepositry repositry){
        return new LoginModel(repositry);
    }

    @Provides
    public LoginRepositry provideLoginReositry (){
        return new MemoryRepositry();
    }
}
