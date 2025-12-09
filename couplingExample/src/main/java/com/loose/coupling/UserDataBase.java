package com.loose.coupling;

public class UserDataBase implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "UserDataBase Connected  ";
    }

    @Override
    public String getUserName() {
        return "Prabhat From DB";
    }

    @Override
    public String getUserEmail() {
        return "1996prabhat@gmail.com";
    }

    @Override
    public String getUserPassword() {
        return "nopasswordispassword";
    }
}
