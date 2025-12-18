package com.Ioc.coupling;

public class WebServiceProvider implements UserDataProvider {
    public String getUserdetails(){
        return "fetching details from webservice";
    }
}
