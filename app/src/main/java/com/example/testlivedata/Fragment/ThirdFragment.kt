package com.example.testlivedata.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.testlivedata.Data.TransitionData
import com.example.testlivedata.R


class ThirdFragment : Fragment(R.layout.fragment_third) {

    private val args: ThirdFragmentArgs by navArgs()

    companion object {
        private var counter = 0
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<AppCompatButton>(R.id.nextButton).apply {
            setOnClickListener{
                val transitionData = TransitionData(++counter)
                val action = ThirdFragmentDirections.actionThirdFragmentToForceFragment(transitionData)
                findNavController().navigate(action)
            }
        }
        view.findViewById<AppCompatTextView>(R.id.count).apply {
            text = args.counter.toString()
        }

    }

}