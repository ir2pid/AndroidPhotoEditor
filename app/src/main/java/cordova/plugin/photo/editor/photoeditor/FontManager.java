package cordova.plugin.photo.editor.photoeditor;

import android.content.Context;
import android.graphics.Typeface;

public class FontManager {

    public static final String FONTAWESOME ="FAsolid.ttf";
    public static final String EMOJIONE = "emojione-android.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
