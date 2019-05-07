package fr.demartin.screen_pref;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ReloadListener implements View.OnClickListener {
    Activity act;

    public ReloadListener(Activity act){
        this.act = act;
    }
    @Override
    public void onClick(View view) {
        Intent i = new Intent(act, MainActivity.class);
        act.startActivity(i);
        act.finish();
    }
}
