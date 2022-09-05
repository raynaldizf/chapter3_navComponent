package com.example.chapter3_navcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_satu.*
import kotlinx.android.synthetic.main.fragment_tiga.*

class FragmentTiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tiga, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnToSatu.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragmentSatu)
        }
        var getUmur = arguments?.getString("dataumur")
        getTextUmur.text = getUmur

        Toast.makeText(context,"Umur anda : $getUmur",Toast.LENGTH_SHORT).show()
    }

}