package com.example.practikrmp4.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practikrmp4.R
import com.example.practikrmp4.viewmodel.MainViewModel
import com.example.practikrmp4.ui.BlankFragment_second

class BlankFragment_first : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        val button1 = view.findViewById<Button>(R.id.button1)
        val button2 = view.findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            viewModel.navigateTo(BlankFragment_third::class.java)
        }

        button2.setOnClickListener {
            viewModel.navigateTo(BlankFragment_second::class.java)
        }
    }
}