package es.guiguegon.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import es.guiguegon.kotlinsample.R
import es.guiguegon.kotlinsample.extensions.inflate

/**
 * Created by guiguegon on 15/11/2016.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.item_news_loading))

}