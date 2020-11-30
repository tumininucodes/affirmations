package com.kith.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kith.affirmations.adapter.ItemAdapter
import com.kith.affirmations.data.DataSource
import com.kith.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = DataSource().loadAffirmations()

        val recyclerView = binding.recyclerView

        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)
    }
}
