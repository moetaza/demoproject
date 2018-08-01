package com.example.moetaz.mvptoturial;



public interface LoginActivityMVP {

    interface View{
        String getFirstname();
        String getLastname();
        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();

        void setFirstname(String name);
        void setLastname (String name);

    }

    interface Presenter {

        void setView (LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();

    }

    interface Model{

        void createUser(String fname , String sname);
        User getUser();

    }
}
