package com.example.testlivedata.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.testlivedata.R

class ForceFragment : Fragment(R.layout.fragment_force) {

    private val args: ForceFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<AppCompatButton>(R.id.nextButton).apply {
            setOnClickListener {
                val action = ForceFragmentDirections.actionForceFragmentToFifthFragment()
                findNavController().navigate(action)
            }
        }
        view.findViewById<AppCompatTextView>(R.id.messageView).apply {
            text = args.transitionData?.message

        }
    }
}