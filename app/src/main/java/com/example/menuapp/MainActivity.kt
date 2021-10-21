package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    //onCreateMenu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("Text", "Welcome to Home Activity!!")
                startActivity(intent)
                return true
            }
            R.id.help -> {
                val intent2 = Intent(this, HelpActivity::class.java)
                intent2.putExtra("Text", "Welcome to Help Activity!!")
                startActivity(intent2)
                return true
            }
            R.id.about -> {
                val intent = Intent(this, AboutActivity::class.java)
                intent.putExtra("Text", "Welcome to About Activity!!")
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}