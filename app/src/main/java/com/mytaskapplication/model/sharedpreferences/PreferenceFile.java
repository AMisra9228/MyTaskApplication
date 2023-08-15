package com.mytaskapplication.model.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mytaskapplication.R;
import com.mytaskapplication.model.SocialResponse.User;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class PreferenceFile {

    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;

    public PreferenceFile(Context context) {
        preferences = context.getSharedPreferences(context.getString(R.string.app_name), 0);
        editor = preferences.edit();
    }

    public static void clearSessionManager() {
        editor.clear().apply();
    }


    public static void setWholeUserData(User data) {
        editor.putString("Userdata", new GsonBuilder().create().toJson(data));

    }


    public static void createUser(String id, String name, String mobile, String email, String googleId, String facebookId, String profilePicture, String member_type,String token) {
        editor.putString(PreferenceKey.KEY_ID, id);
        editor.putString(PreferenceKey.KEY_FULLNAME, name);
        editor.putString(PreferenceKey.KEY_MOBILE, mobile);
        editor.putString(PreferenceKey.KEY_EMAIL, email);
        editor.putString(PreferenceKey.KEY_GOOGLE_ID, googleId);
        editor.putString(PreferenceKey.KEY_FACEBOOK_ID, facebookId);
        editor.putString(PreferenceKey.KEY_IMAGE, profilePicture);
        editor.putString(PreferenceKey.KEY_MEMBER, member_type);
        editor.putString(PreferenceKey.KEY_TOKEN, "Bearer " + token);
        editor.apply();

    }



    public static String getdata(String id) {
        return preferences.getString(id, "");
    }



    public static void setLogged(boolean is) {
        editor.putBoolean("USER_LOGGED", is);
        editor.apply();
    }


    public static boolean isLogged() {
        return preferences.getBoolean("USER_LOGGED", false);
    }


    public static void setLanguage(boolean is) {
        editor.putBoolean("LANGUAGE", is);
        editor.commit();
    }


    public static boolean isLanguageSelected() {
        return preferences.getBoolean("LANGUAGE", false);
    }


    /*public static void saveLocationList(ArrayList<CitiesItem> list){
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString("location", json);
        editor.apply();

    }

    public static ArrayList<CitiesItem> getLocationList(){
        Gson gson = new Gson();
        String json = preferences.getString("location", null);
        Type type = new TypeToken<ArrayList<CitiesItem>>() {}.getType();
        return gson.fromJson(json, type);
    }*/


    public static void savePinCodeListList(ArrayList<String> list){
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString("pincode", json);
        editor.apply();

    }

    public static ArrayList<String> getgetPinCodeListList(){
        Gson gson = new Gson();
        String json = preferences.getString("pincode", null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        return gson.fromJson(json, type);
    }


}
