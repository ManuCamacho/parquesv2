package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding
import kotlinx.coroutines.internal.artificialFrame



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val TAG=" nombre "

            Log.d(TAG, "El parque es ${binding.nombre.text} ")
            Log.d(TAG, "El parque es ${binding.descripcion.text} ")
            Log.d(TAG, "El parque es ${binding.telefono.text} ")
            Log.d(TAG, "El parque es ${binding.web.text} ")

            //PARA LOS CHECKBOX
            if (binding.Deportes.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.Deportes.text} ")
            }
            if (binding.ParqueInfantil.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.ParqueInfantil.text} ")
            }
            if (binding.Restaurante.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.Restaurante.text} ")
            }
            if (binding.ZonaMascotas.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.ZonaMascotas.text} ")

            }

            //PARA LOS SPINNER
            Log.d(TAG, "La hora de apertura es ${binding.SpinnerHoraApertura.selectedItem}")
            Log.d(TAG, "La hora de cierre es ${binding.SpinnerHoraCierre.selectedItem}")


        }
    }
}
