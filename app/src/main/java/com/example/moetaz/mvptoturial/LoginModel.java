package com.example.moetaz.mvptoturial;



public class LoginModel implements LoginActivityMVP.Model {
    private LoginRepositry repositry;

    public LoginModel(LoginRepositry repositry) {
        this.repositry = repositry;
    }

    @Override
    public void createUser(String fname, String sname) {
        repositry.saveUser(new User(fname,sname));
    }

    @Override
    public User getUser() {
        return repositry.getUser();
    }
}
