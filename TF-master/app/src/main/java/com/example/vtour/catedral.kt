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
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_catedral.*
import com.lespinside.simplepanorama.view.SphericalView
import com.panoramagl.utils.PLUtils
import com.panoramagl.utils.PLUtils.getBitmap as getBitmap1


class catedral : AppCompatActivity() {

    private var sphericalView: SphericalView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catedral)
        val imabuton = findViewById<ImageView>(R.id.imageboton2)

        sphericalView = findViewById(R.id.spherical_view)
        sphericalView!!.setPanorama(PLUtils.getBitmap(this, R.drawable.cte), false);

        imabuton.setOnClickListener {
            Toast.makeText(this@catedral,"Map.", Toast.LENGTH_LONG).show()
            val intent = Intent(this, map::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


}
