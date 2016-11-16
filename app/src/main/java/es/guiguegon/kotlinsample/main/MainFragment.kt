package es.guiguegon.kotlinsample.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.guiguegon.kotlinsample.R
import es.guiguegon.kotlinsample.adapters.NewsAdapter
import es.guiguegon.kotlinsample.extensions.inflate
import es.guiguegon.kotlinsample.models.RedditNewsItem
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by guiguegon on 15/11/2016.
 */

class MainFragment() : Fragment() {

    companion object {
        fun newInstance(): MainFragment {
            val mainFragment = MainFragment()
            return mainFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_main)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUi()
        if (savedInstanceState == null) {
            fillAdapter()
        }
    }

    private fun fillAdapter() {
        val news = (1..10).map {
            RedditNewsItem(
                    "author$it",
                    "Title $it",
                    it, // number of comments
                    1457207701L - it * 200, // time
                    "http://lorempixel.com/200/200/technics/$it", // image url
                    "url"
            )
        }
        (news_list.adapter as NewsAdapter).addNews(news)
    }

    private fun setUpUi() {
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        initAdapter()
    }

    private fun initAdapter() {
        if (news_list.adapter == null) {
            news_list.adapter = NewsAdapter()
        }
    }

//    private val newsList: RecyclerView by lazy {
//        news_list.setHasFixedSize(true)
//        news_list.layoutManager = LinearLayoutManager(context)
//        news_list
//    }
}