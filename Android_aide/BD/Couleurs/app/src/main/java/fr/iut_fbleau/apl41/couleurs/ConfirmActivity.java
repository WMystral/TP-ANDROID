package fr.iut_fbleau.apl41.couleurs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ConfirmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_confirm);
        Intent i = getIntent();
        String ligne = i.getStringExtra("ligne");

        Button confirm = (Button)(findViewById(R.id.confirm_button));
        Button cancel = (Button)(findViewById(R.id.cancel_button));

        ConfirmListener lis = new ConfirmListener(confirm.getId(),cancel.getId(),this,ligne);

        confirm.setOnClickListener(lis);
        cancel.setOnClickListener(lis);

    }
}
