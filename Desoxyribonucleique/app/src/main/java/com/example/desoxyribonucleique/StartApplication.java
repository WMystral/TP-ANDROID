package com.example.desoxyribonucleique;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;


public class StartApplication implements Preference.OnPreferenceClickListener {
    private InterfacePreference interfacepreference;
    public StartApplication(InterfacePreference ip) {
        this.interfacepreference = ip;
    }
    @Override
    public boolean onPreferenceClick(Preference preference) {
        Intent main = new Intent(this.interfacepreference,Desoxyribonucleique.class);
        this.interfacepreference.startActivity(main);
        return false;
    }
}
