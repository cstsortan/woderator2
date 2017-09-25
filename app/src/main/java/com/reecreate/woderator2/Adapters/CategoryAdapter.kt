package com.reecreate.woderator2.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.reecreate.woderator2.Model.Category
import com.reecreate.woderator2.R
import kotlinx.android.synthetic.main.category_list.view.*

/**
 * Created by reecreate on 25/09/2017.
 */
class CategoryAdapter(val context: Context , val categories: List<Category>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
    return categories[position]

    }

    override fun getItemId(p0: Int): Long {
return 0
    }

    override fun getCount(): Int {
return categories.count()    }



    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}