package es.guiguegon.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by guiguegon on 15/11/2016.
 */
interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}