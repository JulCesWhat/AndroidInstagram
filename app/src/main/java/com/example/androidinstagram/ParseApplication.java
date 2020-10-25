package com.example.androidinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Fnv01UlEJfIsXT4OBlwGXeT4fqTbhBQhVwrOxzDR")
                .clientKey("VehqDvlqrHJQjB5TfHRqs9a5DiOaPhWpF1145uaT")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
