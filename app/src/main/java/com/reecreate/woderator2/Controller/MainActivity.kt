package com.reecreate.woderator2.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import com.reecreate.woderator2.Adapters.CategoryAdapter
import com.reecreate.woderator2.Adapters.CategoryRecycleAdapter
import com.reecreate.woderator2.R
import com.reecreate.woderator2.Services.DataService
import com.reecreate.woderator2.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val kitListIntent = Intent(this, KitListActivity::class.java)
            kitListIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(kitListIntent)

        }



        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }
}
