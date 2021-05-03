package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;

public class MyApp {
  public static void main(String[] args) {
    User tony = new User("Tony");
    System.out.println(tony.name);
    tony.sayHi();

    AdminUser steve = new AdminUser("Steve");
    System.out.println(steve.name);
    steve.sayHi();
    steve.sayHello();

  }
}