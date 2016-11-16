package es.guiguegon.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import es.guiguegon.kotlinsample.R
import es.guiguegon.kotlinsample.extensions.getFriendlyTime
import es.guiguegon.kotlinsample.extensions.inflate
import es.guiguegon.kotlinsample.extensions.loadImg
import es.guiguegon.kotlinsample.models.RedditNewsItem
import kotlinx.android.synthetic.main.item_news.view.*

/**
 * Created by guiguegon on 15/11/2016.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.item_news_loading)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }

}