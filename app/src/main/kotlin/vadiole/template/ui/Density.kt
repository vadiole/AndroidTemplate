package vadiole.template.ui

import android.util.TypedValue
import kotlin.math.ceil

/**
 * A density of the screen.
 *
 * Used to convert dp to pixels.
 */
interface Density : ResourcesOwner {

    val density: Float
        get() = getResources().displayMetrics.density

    val Int.dp: Int
        get() = ceil(this * density).toInt()

    val Float.dp: Float
        get() = this * density

    val Float.sp: Float
        get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this, getResources().displayMetrics)
}
