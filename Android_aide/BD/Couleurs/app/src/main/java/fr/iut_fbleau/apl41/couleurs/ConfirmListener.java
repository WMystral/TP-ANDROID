package fr.iut_fbleau.apl41.couleurs;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;
import android.provider.BaseColumns;

public class ConfirmListener implements View.OnClickListener {
    private int id_confirm;
    private int id_cancel;
    private ConfirmActivity act;
    private String ligne;

    public ConfirmListener(int id_confirm, int id_cancel,ConfirmActivity act,String ligne){
        this.id_confirm=id_confirm;
        this.id_cancel=id_cancel;
        this.act=act;
        this.ligne = ligne;
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==id_cancel){
            Intent i = new Intent(act,Liste.class);
            act.startActivity(i);
            act.finish();
        }else if(view.getId()==id_confirm){

            AccesBaseDeDonnees ac = new AccesBaseDeDonnees(act);
            SQLiteDatabase baseDeDonnees = ac.getReadableDatabase();

            baseDeDonnees.delete(ac.NOM_TABLE, BaseColumns._ID + "=?",new String[]{ligne});

            Intent i = new Intent(act,Liste.class);
            act.startActivity(i);
            act.finish();
        }
    }
}
