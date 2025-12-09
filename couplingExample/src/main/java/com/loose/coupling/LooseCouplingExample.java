package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserManager userManager=new UserManager();
//        System.out.println(userManager.getUserInfo());
            //get User Details from db
           UserDataProvider userDataProvider = new UserDataBase();
           UserManager userManager=new UserManager(userDataProvider);
            //get User Details from webService
           UserDataProvider userDataProviderWS=new WebServiceDataProvider();
           UserManager userManagerWS=new UserManager(userDataProviderWS);

        System.out.println(userManagerWS.getUserName());
        System.out.println(userManagerWS.getUserInfo());
        System.out.println(userManagerWS.getUserPassword());
        System.out.println(userManagerWS.getUserEmail());

        System.out.println(userManager.getUserInfo());
        System.out.println(userManager.getUserName());
        System.out.println(userManager.getUserPassword());
        System.out.println(userManager.getUserEmail());;
        System.out.println("User Details Fetched");
    }
}
