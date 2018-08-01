package com.example.moetaz.mvptoturial;



public class MemoryRepositry implements LoginRepositry {

    User user;

    @Override
    public User getUser() {

        if (user == null){
            User user = new User("Moetaz","Ashraf");
            user.setId(0);
            return user;
        }else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        if (user == null){
            user = getUser();
        }

        this.user = user;
    }
}
