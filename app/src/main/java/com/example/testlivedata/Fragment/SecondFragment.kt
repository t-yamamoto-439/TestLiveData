package com.example.testlivedata.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController
import com.example.testlivedata.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    companion object {
        private var counter = 0
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<AppCompatButton>(R.id.nextButton).apply {
            setOnClickListener {
                val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(++counter)
                findNavController().navigate(action)
            }
        }
    }
}