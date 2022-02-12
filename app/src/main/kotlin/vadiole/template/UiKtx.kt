package vadiole.template

import android.content.Context
import android.view.ViewGroup
import kotlin.math.ceil

const val matchParent = ViewGroup.LayoutParams.MATCH_PARENT
const val wrapContent = ViewGroup.LayoutParams.WRAP_CONTENT

fun Float.dp(context: Context) = this * context.resources.displayMetrics.density

fun Int.dp(context: Context): Int = ceil(this * context.resources.displayMetrics.density).toInt()