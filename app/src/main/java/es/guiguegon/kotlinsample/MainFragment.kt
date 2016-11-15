package es.guiguegon.kotlinsample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    }

    private fun setUpUi() {
//        val newsList = view?.findViewById(R.id.news_list) as RecyclerView?
//        newsList?.setHasFixedSize(true)
//        newsList?.layoutManager = LinearLayoutManager(context)


    }

    private val newsList: RecyclerView by lazy {
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        news_list
    }
}