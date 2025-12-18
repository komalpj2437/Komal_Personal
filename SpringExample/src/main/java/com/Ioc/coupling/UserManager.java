package com.Ioc.coupling;


public class UserManager {
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
    public String getUserinfo(){
        return userDataProvider.getUserdetails();
    }
}
