package com.examplebeginer.kotlincalc

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player1Turn = false;

        //val button = findViewById(R.id.theOnlyButton)
        val button = findViewById<Button>(R.id.onlyButton)

        val square0 = findViewById<Button>(R.id.B0)
        val square1 = findViewById<Button>(R.id.B1)

        //uncommenting this will make app to crash why though?
        val square2 = findViewById<Button>(R.id.B2)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            player1Turn = !player1Turn;

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1Turn", Toast.LENGTH_LONG).show()

            builder.setMessage("$player1Turn")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        square0.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "AWEF", Toast.LENGTH_LONG).show()

            builder.setMessage("AWEGDSVKJH")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        square1.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "AWEF", Toast.LENGTH_LONG).show()

            builder.setMessage("AWEGDSVKJH")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        square2.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "AWEF", Toast.LENGTH_LONG).show()

            builder.setMessage("AWEGDSVKJH")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }




    }
}
