package dev.francisco.conversortemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            if (!binding.editCelcios.text.toString().isEmpty()) {
                val celsius = binding.editCelcios.text.toString().toDouble()
                val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.textResultado.text = "$fahrenheit ºF"
            }else{
                binding.textResultado.text ="Temperatura invalida"
            }
        }
    }
}