package es.guiguegon.kotlinsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by guiguegon on 15/11/2016.
 */

fun ViewGroup.inflate(layoutId : Int, attachToRoot: Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}