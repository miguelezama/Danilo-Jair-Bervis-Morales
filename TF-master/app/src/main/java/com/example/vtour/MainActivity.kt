package com.example.vtour

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageButton = findViewById<ImageView>(R.id.imageView)

        imageButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"La ciudad alberga unos de los patrimonios históricos más grande y diversos de Nicaragua, el patrimonio monumental de León es rico.", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Main2Activity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}

////  sphericalView = findViewById(R.id.spherical_view)
//        sphericalView!!.setPanorama(PLUtils.getBitmap(this, R.drawable.fondo), true);