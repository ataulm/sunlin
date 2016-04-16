package com.ataulm.basic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MyActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)

        val dummyData = createDummyData()
    }

    private fun createDummyData() : List<String> {
        return listOf(
                "Today - Sunny - 88 / 63",
                "Tomorrow - Foggy - 70 / 46",
                "Weds - Cloudy - 72 / 63",
                "Thurs - Rainy - 64 / 51",
                "Fri - Foggy - 70 / 46",
                "Sat - Sunny - 76 / 68"
        )
    }

}
