package com.example.parkingapp;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {


    private SharedPreferences sharedPreferences;
    private static final String IS_LOGIN = "isLogin";
    private static final String USER_NAME = "userName";
    private static final String USER_EMAIL = "userEmail";
    private static final String USER_NUMBER = "userNumber";
    private static final String USER_PASSWORD = "userPassword";

    public SessionManager(Context context) {


        sharedPreferences = context.getSharedPreferences(IS_LOGIN, Context.MODE_PRIVATE);
        sharedPreferences = context.getSharedPreferences(USER_NAME, Context.MODE_PRIVATE);
        sharedPreferences = context.getSharedPreferences(USER_EMAIL, Context.MODE_PRIVATE);
        sharedPreferences = context.getSharedPreferences(USER_NUMBER, Context.MODE_PRIVATE);
        sharedPreferences = context.getSharedPreferences(USER_PASSWORD, Context.MODE_PRIVATE);
    }


    public void UserName(String name) {

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_NAME, name);
        editor.commit();
        editor.apply();
    }

    public String fetchUserName() {
        return sharedPreferences.getString(USER_NAME,"");
    }
    public void UserNumber(String name) {

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_NUMBER, name);
        editor.commit();
        editor.apply();
    }

    public String fetchUserNumber() {
        return sharedPreferences.getString(USER_NUMBER,"");
    }
    public void UserPassword(String name) {

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_PASSWORD, name);
        editor.commit();
        editor.apply();
    }

    public String fetchUserPassword() {
        return sharedPreferences.getString(USER_PASSWORD,"");
    }
    public void UserEmail(String name) {

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_PASSWORD, name);
        editor.commit();
        editor.apply();
    }

    public String fetchUserEmail() {
        return sharedPreferences.getString(USER_PASSWORD,"");
    }

}
