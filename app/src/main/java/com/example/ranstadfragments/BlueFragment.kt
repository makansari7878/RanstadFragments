package com.example.ranstadfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var myview = inflater.inflate(R.layout.blue_layout, container, false)
        var resultTextView = myview.findViewById<TextView>(R.id.textViewReceiveData)
        var result = arguments?.getString("keyname")
        resultTextView.text = result
        Toast.makeText(activity, "result is $result", Toast.LENGTH_SHORT).show()
        return myview
    }
}