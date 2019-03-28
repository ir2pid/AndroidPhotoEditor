package cordova.plugin.photo.editor.photoeditor

import android.content.Context
import android.graphics.Typeface


object FontManagerKotlin {

    val FONTAWESOME = "FAsolid.ttf"
    val EMOJIONE = "emojione-android.ttf"

    fun getTypeface(context: Context, font: String): Typeface {
        return Typeface.createFromAsset(context.assets, font)
    }
}