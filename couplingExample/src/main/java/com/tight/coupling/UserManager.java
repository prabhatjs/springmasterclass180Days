package com.tight.coupling;

public class UserManager {
    //create instance of userDatabase Class we get user info from db
    //usermanager is tightly coupled with userdatabase,suppose we have 5 db connection ,we switch db now now we change in manager class
    private UserDataBase userDataBase=new UserDataBase();

    public String getUserInfo()
    {
        return userDataBase.getUserDetails();
    }
}
