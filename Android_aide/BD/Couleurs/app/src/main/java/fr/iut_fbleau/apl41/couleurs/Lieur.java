package fr.iut_fbleau.apl41.couleurs;

import android.database.Cursor;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SimpleCursorAdapter;

public class Lieur implements SimpleCursorAdapter.ViewBinder {
    private Liste li;

    public Lieur(Liste li){
        super();
        this.li=li;
    }

    @Override
    public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
        if(view.getId() == R.id.couleur) {
            //view.setBackgroundColor(cursor.getInt(columnIndex));
            Drawable origine = li.getResources().getDrawable(R.drawable.ic_brightness_1_black_24dp);
            Drawable draw = origine.getConstantState().newDrawable();
            draw.mutate();
            PorterDuff.Mode mMode = PorterDuff.Mode.SRC_ATOP;
            draw.setColorFilter(cursor.getInt(columnIndex),mMode);
            view.setBackgroundDrawable(draw);
            return true;
        }
        return false;
    }
}
