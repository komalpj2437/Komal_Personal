package com.tight.coupling;

public class TightCouplingEX {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }

    }

