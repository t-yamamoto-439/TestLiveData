package com.example.testlivedata.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.testlivedata.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<AppCompatButton>(R.id.nextButton).apply {
            setOnClickListener {
                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
                findNavController().navigate(action)
            }
        }
    }
}