package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Get USer Details From Web Service";
    }

    @Override
    public String getUserName() {
        return "Prabhat from web service";
    }

    @Override
    public String getUserEmail() {
        return "email from web service";
    }

    @Override
    public String getUserPassword() {
        return "password from web service";
    }
}
