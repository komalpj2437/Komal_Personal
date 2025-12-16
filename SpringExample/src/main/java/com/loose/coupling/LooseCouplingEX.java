package com.loose.coupling;


public class LooseCouplingEX {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerDB   = new UserManager(databaseProvider);
        System.out.println(userManagerDB.getUserinfo());
        UserDataProvider databaseProvider2 = new Webserviceprovider();
        UserManager userManagerW  = new UserManager(databaseProvider2);
        System.out.println(userManagerW.getUserinfo());



    }

    }

