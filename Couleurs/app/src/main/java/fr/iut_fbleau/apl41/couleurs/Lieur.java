package fr.iut_fbleau.apl41.couleurs;

import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;
/*
   Pour chaque composant de chaques lignes on appelle ce lieur, qui met une donnée dans un COMPOSANT
 */
public class Lieur implements SimpleCursorAdapter.ViewBinder {
    @Override
    public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
        if(view.getId() == R.id.couleur) { //forcément mal finir donc me ce if
            view.setBackgroundColor(cursor.getInt(columnIndex));
            return true;
        }
        return false;
    }
}
