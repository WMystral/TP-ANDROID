package fr.demartin.screen_pref;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class OuvrePrefListener implements View.OnClickListener {
    Activity act;

    public OuvrePrefListener(Activity act){
        this.act = act;
    }
    @Override
    public void onClick(View view) {
        Intent i = new Intent(act, SettingsActivity.class);
        act.startActivity(i);

    }
}
