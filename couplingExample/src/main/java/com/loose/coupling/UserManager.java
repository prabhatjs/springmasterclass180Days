package com.loose.coupling;

public class UserManager {
    //create instance of userDatabase Class we get user info from db
    //usermanager is tightly coupled with userdatabase,suppose we have 5 db connection ,we switch db now now we change in manager class
//    private UserDataBase userDataBase=new UserDataBase();
    //in loose coupling we create constructor

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
    public String getUserInfo()
    {
        return userDataProvider.getUserDetails();
    }
    public String getUserName()
    {
        return userDataProvider.getUserName();
    }
    public  String getUserEmail()
    {
        return userDataProvider.getUserEmail();
    }
    public String getUserPassword()
    {
        return userDataProvider.getUserPassword();
    }
}
