package com.loose.coupling;

public class Webserviceprovider implements UserDataProvider{
    public String getUserdetails(){
        return "fetching details from webservice";
    }
}
