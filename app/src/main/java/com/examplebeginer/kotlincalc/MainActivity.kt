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

import java.util.Arrays



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player1Turn = true;

        //val button = findViewById(R.id.theOnlyButton)
        val button = findViewById<Button>(R.id.onlyButton)

        val square0 = findViewById<Button>(R.id.B0)
        val square1 = findViewById<Button>(R.id.B1)
        val square2 = findViewById<Button>(R.id.B2)

        val square3 = findViewById<Button>(R.id.B3)
        val square4 = findViewById<Button>(R.id.B4)
        val square5 = findViewById<Button>(R.id.B5)

        val square6 = findViewById<Button>(R.id.B6)
        val square7 = findViewById<Button>(R.id.B7)
        val square8 = findViewById<Button>(R.id.B8)

        var player1 = arrayOfNulls<Int>(55)
        var player2 = arrayOfNulls<Int>(55)

        square0.setOnClickListener {

            if(square0.text == "") {
                if (player1Turn) {
                    player1[0] = 0;
                    square0.text = "O"
                } else {
                    player2[0] = 0;
                    square0.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        square1.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            if(square1.text == "") { // if it hasnt been clicked
                if (player1Turn) {
                    player1[1] = 1;
                    square1.text = "O"
                } else {
                    player2[1] = 1;
                    square1.text = "x"
                }
                player1Turn = !player1Turn;
            }

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

            if(square2.text == "") {
                if (player1Turn) {
                    player1[2] = 2;
                    square2.text = "O"
                } else {
                    player2[2] = 2;
                    square2.text = "x"
                }
                player1Turn = !player1Turn;
            }

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

        //3
        square3.setOnClickListener {
            if(square3.text == "") {
                if (player1Turn) {
                    player1[3] = 3;
                    square3.text = "O"
                } else {
                    player2[3] = 3;
                    square3.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        //4
        square4.setOnClickListener {
            if(square4.text == "") {
                if (player1Turn) {
                    player1[4] = 4;
                    square4.text = "O"
                } else {
                    player2[4] = 4;
                    square4.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        //5
        square5.setOnClickListener {
            if(square5.text == "") {
                if (player1Turn) {
                    player1[5] = 5;
                    square5.text = "O"
                } else {
                    player2[5] = 5;
                    square5.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage("fuck")

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        //6
        square6.setOnClickListener {
            if(square6.text == "") {
                if (player1Turn) {
                    player1[6] = 6;
                    square6.text = "O"
                } else {
                    player2[6] = 6;
                    square6.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        //7
        square7.setOnClickListener {
            if(square7.text == "") {
                if (player1Turn) {
                    player1[7] = 7;
                    square7.text = "O"
                } else {
                    player2[7] = 7;
                    square7.text = "x"
                }
                player1Turn = !player1Turn;
            }

            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        //8
        square8.setOnClickListener {
            if(square8.text == "") {
                if (player1Turn) {
                    player1[8] = 8;
                    square8.text = "O"
                } else {
                    player2[8] = 8;
                    square8.text = "x"
                }
                player1Turn = !player1Turn;
            }


            val builder = AlertDialog.Builder(this)

            builder.setTitle("console.log.alert")

            Toast.makeText(this@MainActivity, "$player1", Toast.LENGTH_LONG).show()

            builder.setMessage(Arrays.toString(player1))

            builder.setPositiveButton("Ight", null)


            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

//        button.setOnClickListener {
//            val builder = AlertDialog.Builder(this)
//
//            player1Turn = !player1Turn;
//
//            builder.setTitle("console.log.alert")
//
//            Toast.makeText(this@MainActivity, "awefsdgadf", Toast.LENGTH_LONG).show()
//
//            builder.setMessage("$player1Turn")
//
//            builder.setPositiveButton("Ight", null)
//
//            //Create the alertDialog
//            val alertDialog: AlertDialog = builder.create()
//
//            //set other dialog properties
//            alertDialog.setCancelable(false)
//            alertDialog.show()
//        }

    }
}
