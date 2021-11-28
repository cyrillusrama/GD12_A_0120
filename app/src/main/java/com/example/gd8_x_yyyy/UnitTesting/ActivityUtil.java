package com.example.gd8_x_yyyy.UnitTesting;

import android.content.Context;
import android.content.Intent;

import com.example.gd8_x_yyyy.ProfilActivity;

public class ActivityUtil {
    private Context context;

    public ActivityUtil(Context context) {
        this.context = context;
    }

    public void startMainProfil() {
        context.startActivity(new Intent(context, ProfilActivity.class));
    }
}