package com.example.gd8_x_yyyy.UnitTesting;

import com.example.gd8_x_yyyy.models.Profil;

public interface ProfilCallback {
    void onSuccess(boolean value, Profil profil);
    void onError();

}
