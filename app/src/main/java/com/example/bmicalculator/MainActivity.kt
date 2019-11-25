package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate:Button=findViewById(R.id.calculate)

        btnCalculate.setOnClickListener(){
            CalculateBMI()
        }
    }


    private fun CalculateBMI(){
        val txtWeight:Double=weight.text.toString().toDouble()
        val txtHeight:Double=height.text.toString().toDouble()
        val txtResult:Double= txtWeight/(txtHeight*txtHeight)

        result_BMI.text=txtResult.toString()




        if(txtResult<18.5){
            image_Result.setImageResource(R.drawable.under);
        }else if (txtResult>=18.5 &&txtResult<=24.9){
            image_Result.setImageResource(R.drawable.normal);
        }else {
            image_Result.setImageResource(R.drawable.over);
        }


    }

}
