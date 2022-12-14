package vn.sunasterisk.facebookautomationtest;

import vn.sunasterisk.facebookautomationtest.pagetest.LoginPageTest;

public class Main { public static void main(String[] args) throws InterruptedException {
    LoginPageTest Lgt = new LoginPageTest();

    Lgt.loginFacebook("100088268452149","Aa@123456");
    Lgt.loginFacebook("100088268452149","ABC123@@");
    Lgt.loginFacebook("1000999999999999","ABC123@@");
}
}
