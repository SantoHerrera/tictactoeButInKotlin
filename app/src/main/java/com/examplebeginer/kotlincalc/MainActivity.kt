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

        //val button = findViewById(R.id.theOnlyButton)
        val button = findViewById<Button>(R.id.onlyButton)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle(R.string.dialogTitle)

            builder.setMessage(R.string.dialogMessage)

            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("Yes") {
                dialogInterface, which -> Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
            }
            
            //perorming cancel action
            builder.setNeutralButton("Cancel"){
                dialogInterface, which -> Toast.makeText(applicationContext, "clicked cancel\n operation cancel", Toast.LENGTH_LONG).show()
            }
            
            //performing negative actoin 
            builder.setNegativeButton("No") {
                DialogInterface, which -> Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()

            }
            //Create the alertDialog
            val alertDialog: AlertDialog = builder.create()

            //set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }




    }
}
