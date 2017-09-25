package com.reecreate.woderator2.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.reecreate.woderator2.Model.Category
import com.reecreate.woderator2.R
import com.reecreate.woderator2.Utilities.EXTRA_CATEGORY_IMAGE
import com.reecreate.woderator2.Utilities.EXTRA_CATEGORY_TITLE

class KitListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kit_list)

        val intent = getIntent()
        val categoryTitle = intent.getStringExtra(EXTRA_CATEGORY_TITLE)
        val categoryImage = intent.getStringExtra(EXTRA_CATEGORY_IMAGE)
        val category = Category(categoryTitle, categoryImage)

        //and do whatever with the category
    }
}
