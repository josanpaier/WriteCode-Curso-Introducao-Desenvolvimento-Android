package com.josanpaier.menuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.josanpaier.menuapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener(this)
        binding.buttonOrder.setOnClickListener(this)
    }
    override fun onClick(view: View) {
        if (view.id == R.id.button_Calculate) {
            calculate()
        } else if (view.id == R.id.button_Order) {
            order()
        }
    }
    private fun isValid():Boolean {
        return (binding.checkEntrance01.isChecked == true ||
                binding.checkEntrance02.isChecked == true ||
                binding.checkPlate01.isChecked    == true ||
                binding.checkPlate02.isChecked    == true ||
                binding.checkPlate03.isChecked    == true ||
                binding.checkPlate04.isChecked    == true ||
                binding.checkDrink01.isChecked    == true ||
                binding.checkDrink02.isChecked    == true ||
                binding.checkDessert01.isChecked  == true ||
                binding.checkDessert02.isChecked  == true)
    }
    private fun calculate() {
        var priceEntrance01:Float
        var priceEntrance02:Float
        var pricePlate01:Float
        var pricePlate02:Float
        var pricePlate03:Float
        var pricePlate04:Float
        var priceDrink01:Float
        var priceDrink02:Float
        var priceDessert01:Float
        var priceDessert02:Float

        if (isValid()) {
            if (binding.checkEntrance01.isChecked) {
                priceEntrance01 = binding.textPriceEntrance01.text.toString().toFloat()
            } else {
                priceEntrance01 = 0f
            }
            if (binding.checkEntrance02.isChecked) {
                priceEntrance02 = binding.textPriceEntrance02.text.toString().toFloat()
            } else {
                priceEntrance02 = 0f
            }
            if (binding.checkPlate01.isChecked) {
                pricePlate01 = binding.textPricePlate01.text.toString().toFloat()
            } else {
                pricePlate01 = 0f
            }
            if (binding.checkPlate02.isChecked) {
                pricePlate02 = binding.textPricePlate02.text.toString().toFloat()
            } else {
                pricePlate02 = 0f
            }
            if (binding.checkPlate03.isChecked) {
                pricePlate03 = binding.textPricePlate03.text.toString().toFloat()
            } else {
                pricePlate03 = 0f
            }
            if (binding.checkPlate04.isChecked) {
                pricePlate04 = binding.textPricePlate04.text.toString().toFloat()
            } else {
                pricePlate04 = 0f
            }
            if (binding.checkDrink01.isChecked) {
                priceDrink01 = binding.textPriceDrink01.text.toString().toFloat()
            } else {
                priceDrink01 = 0f
            }
            if (binding.checkDrink02.isChecked) {
                priceDrink02 = binding.textPriceDrink02.text.toString().toFloat()
            } else {
                priceDrink02 = 0f
            }
            if (binding.checkDessert01.isChecked) {
                priceDessert01 = binding.textPriceDessert01.text.toString().toFloat()
            } else {
                priceDessert01 = 0f
            }
            if (binding.checkDessert02.isChecked) {
                priceDessert02 = binding.textPriceDessert02.text.toString().toFloat()
            } else {
                priceDessert02 = 0f
            }
            val totalValue = priceEntrance01 + priceEntrance02 + pricePlate01 + pricePlate02 + pricePlate03 + pricePlate04 + priceDrink01 + priceDrink02 + priceDessert01 + priceDessert02

            binding.textLabelResult.text = "R$ ${"%.2f".format(totalValue)}"
        } else {
            binding.textLabelResult.text = "R$ 0.00"
            Toast.makeText(this, R.string.text_Select_One_Of_The_Options, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, R.string.text_Select_Your_Order_Options, Toast.LENGTH_SHORT).show()
        }
    }

    private fun order() {
        if (!isValid()) {
            Toast.makeText(this, R.string.text_Select_One_Of_The_Options, Toast.LENGTH_SHORT).show()
        } else if (binding.textLabelResult.text == "R$ 0.00") {
            Toast.makeText(this, R.string.text_First_Calculate, Toast.LENGTH_LONG).show()
        } else if (binding.textLabelResult.text != "R$ 0.00") {
            calculate()
            Toast.makeText(this, R.string.text_Order_Placed, Toast.LENGTH_LONG).show()
        }
    }
}