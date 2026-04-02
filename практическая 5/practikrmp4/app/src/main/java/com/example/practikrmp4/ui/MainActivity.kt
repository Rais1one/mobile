package com.example.practikrmp4.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.practikrmp4.ui.BlankFragment_first
import com.example.practikrmp4.R
import com.example.practikrmp4.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.navigateTo.observe(this) { fragmentClass ->
            fragmentClass?.let {
                val fragment = it.getDeclaredConstructor().newInstance()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.nav_host_fragment, fragment)
                    .addToBackStack(null)
                    .commit()
                viewModel.navigateComplete()
            }
        }

        viewModel.navigateBack.observe(this) { shouldNavigateBack ->
            if (shouldNavigateBack) {
                supportFragmentManager.popBackStack()
                viewModel.navigateComplete()
            }
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, BlankFragment_first())
                .commit()
        }
    }
}