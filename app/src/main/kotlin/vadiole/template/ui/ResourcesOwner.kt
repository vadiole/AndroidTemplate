package vadiole.template.ui

import android.content.res.Resources

/**
 * For classes that have access to [Resources]
 */
interface ResourcesOwner {
    fun getResources(): Resources
}
