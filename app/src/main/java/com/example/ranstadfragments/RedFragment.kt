package com.example.ranstadfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var myView = inflater.inflate(R.layout.red_layout,container, false )

        var passButton = myView.findViewById<Button>(R.id.buttonPass)
        passButton.setOnClickListener {
            var blueFragment = BlueFragment()
            var myBundle = Bundle()
            myBundle.putString("keyname", "ANSARI")
            blueFragment.arguments = myBundle

            fragmentManager?.beginTransaction()?.replace(R.id.myLayout, blueFragment)?.addToBackStack(null)?.commit()
        }


        return myView
    }
}