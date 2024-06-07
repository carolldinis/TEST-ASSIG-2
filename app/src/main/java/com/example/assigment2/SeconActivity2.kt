package com.example.petcare

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assigment2.R

class SeconActivity2 : AppCompatActivity() {

    // Define variables for the buttons and TextViews
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var hungerView: TextView
    private lateinit var cleanView: TextView
    private lateinit var happyView: TextView
    private lateinit var petImageView: ImageView

    private var health = 20
    private var hunger = 0
    private var cleanliness = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Initialize the variables
        feedButton = findViewById(R.id.Feedbutton)
        cleanButton = findViewById(R.id.CleanButton)
        playButton = findViewById(R.id.PlayButton)
        hungerView = findViewById(R.id.HungerView)
        cleanView = findViewById(R.id.CleanView)
        happyView = findViewById(R.id.HappyView)
        petImageView = findViewById(R.id.ImageView2)


        // Set onClick listeners for the buttons
        feedButton.setOnClickListener {
            hunger += 1
            hungerView.text = "Hunger: $hunger"
            updateStatus("feed")
            petImageView.setImageResource(R.drawable.img_1)
            updateStatus("feed")
        }

        cleanButton.setOnClickListener {
            cleanliness += 1
            cleanView.text = "Cleanliness: $cleanliness"
            updateStatus("clean")
            petImageView.setImageResource(R.drawable.img_2)
            updateStatus("clean")
        }

        playButton.setOnClickListener {
            health += 1
            happyView.text = "Health: $health"
            updateStatus("play")
            petImageView.setImageResource(R.drawable.img_3)
            updateStatus("play")
        }
    }

    private fun updateStatus(action: String) {
        when (action) {
            "feed" -> {
                hungerView.text = "Hunger: $hunger"
            }
            "clean" -> {
                cleanView.text = "Cleanliness: $cleanliness"
            }
            "play" -> {
                happyView.text = "Health: $health"
            }
        }
    }
}

class ImageView2 {

}

