/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.vtour

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class mylistitview (var mCtx:Context, var resources:Int, var items:List<Model>)
    :ArrayAdapter<Model>(mCtx, resources, items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null )
        val imageView:ImageView = view.findViewById(R.id.iconlv)
        val textView:TextView = view.findViewById(R.id.titlelv)
        val textView1:TextView = view.findViewById(R.id.desclv)

        var mItem:Model=items[position]

            imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.photo))
            textView.text=mItem.title
            textView1.text=mItem.desc

        return view
    }
}