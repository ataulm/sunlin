package com.ataulm.basic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MyActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)

        val listView = findViewById(R.id.listview) as ListView
        val dummyData = createDummyData()
        listView.setAdapter(WeatherAdapter(layoutInflater, dummyData))
    }

    private fun createDummyData(): List<String> {
        return listOf(
                "Today - Sunny - 88 / 63",
                "Tomorrow - Foggy - 70 / 46",
                "Weds - Cloudy - 72 / 63",
                "Thurs - Rainy - 64 / 51",
                "Fri - Foggy - 70 / 46",
                "Sat - Sunny - 76 / 68"
        )
    }

    private class WeatherAdapter(
            private val layoutInflater: LayoutInflater,
            private val data: List<String>
    ) : BaseAdapter() {

        override fun getCount(): Int {
            return data.size
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var view = convertView
            if (view == null) {
                view = createView(parent)
            }
            bindView(view, position)
            return view
        }

        private fun createView(parent: ViewGroup): View {
            val view = layoutInflater.inflate(R.layout.list_item_forecast, parent, false)
            return view
        }

        private fun bindView(view: View, position: Int) {
            val textView = view as TextView
            textView.text = getItem(position)
        }

        override fun getItem(position: Int): String {
            return data.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

    }

}
