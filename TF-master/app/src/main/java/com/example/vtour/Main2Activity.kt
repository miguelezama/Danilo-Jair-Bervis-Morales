/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.vtour

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var listView = findViewById<ListView>(R.id.listview)

        var list = mutableListOf<Model>()

        list.add(Model("Playas","León cuenta con varias playas a las cuales tienes que visitar.", R.drawable.playa))
        list.add(Model("Iglesia Catedral","Es Patrimonio de la Humanidad típica construcción barroca colonial fue construida entre 1747 y 1814", R.drawable.icocat))
        list.add(Model("Comida","Leon tiene una rica gastronomia", R.drawable.food))
        list.add(Model("Museos","Leon cuenta con muchos museos a lo largo de la ciudad", R.drawable.muse))

        //adapter
        listView.adapter = mylistitview(this,R.layout.rows, list)

        //click

        listView.setOnItemClickListener { parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@Main2Activity,"Ver imagen", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, playas::class.java)
                // start your next activity
                startActivity(intent)
            }
            if (position==1){
                Toast.makeText(this@Main2Activity,"Ver imagen", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, catedral::class.java)
                // start your next activity
                startActivity(intent)
                //Toast.makeText(this@Main2Activity,"Hello 2", Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@Main2Activity,"Hello 2", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@Main2Activity,"Hello 3", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
