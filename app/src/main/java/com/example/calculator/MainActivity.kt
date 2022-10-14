package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number : Int = 0
    var strNum : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun clear(view: View){
        var text = findViewById<TextView>(R.id.placeholder)
        text.text = ""
    }


    fun number(view:View){
        var text = findViewById<TextView>(R.id.placeholder)
        var one = findViewById<Button>(R.id.one)
        var two = findViewById<Button>(R.id.two)
        var three = findViewById<Button>(R.id.three)
        var four = findViewById<Button>(R.id.four)
        var five = findViewById<Button>(R.id.five)
        var six = findViewById<Button>(R.id.six)
        var seven = findViewById<Button>(R.id.seven)
        var eight = findViewById<Button>(R.id.eight)
        var nine = findViewById<Button>(R.id.nine)
        var zero = findViewById<Button>(R.id.zero)


        if(view.id == one.id){
            text.text = text.text.toString() + "1"
        }
        else if(view.id == two.id){
            text.text = text.text.toString() + "2"
        }

        else if(view.id == three.id){
            text.text = text.text.toString() + "3"
        }

        else if(view.id == four.id){
            text.text = text.text.toString() + "4"
        }

        else if(view.id == five.id){
            text.text = text.text.toString() + "5"
        }

        else if(view.id == six.id){
            text.text = text.text.toString() + "6"
        }

        else if(view.id == seven.id){
            text.text = text.text.toString() + "7"
        }

        else if(view.id == eight.id){
            text.text = text.text.toString() + "8"
        }

        else if(view.id == nine.id){
            text.text = text.text.toString() + "9"
        }

        else if(view.id == zero.id){
            text.text = text.text.toString() + "0"
        }



    }

    fun operator(view:View){
        var text = findViewById<TextView>(R.id.placeholder)

        var add = findViewById<Button>(R.id.add)
        var sub = findViewById<Button>(R.id.substract)
        var multi = findViewById<Button>(R.id.multiplication)
        var div = findViewById<Button>(R.id.division)

        if(view.id == add.id){
            text.text = text.text.toString() + "+"
        }

        else if(view.id == sub.id){
            text.text = text.text.toString() + "-"
        }

        if(view.id == multi.id){
            text.text = text.text.toString() + "x"
        }

        if(view.id == div.id){
            text.text = text.text.toString() + "+"
        }



    }


}
