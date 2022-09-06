package com.example.chapter3_navcomponent.form_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.chapter3_navcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getData =arguments?.getString("username")
        getDataNama.text = getData
        val tempUsername =getDataNama.text.toString()

        btnHitungUmur.setOnClickListener {
            val inputTahun =etInputUmur.text.toString().toInt()
            val hitung = (2022 - inputTahun).toString()
            val bun = Bundle()

            bun.putString("username",tempUsername)
            bun.putString("umur",hitung)

            Navigation.findNavController(view).navigate(R.id.outputHitungTahun2,bun)
        }
        btnProfile.setOnClickListener{
            val bun = Bundle()
            bun.putString("username",tempUsername)
            Navigation.findNavController(view).navigate(R.id.profileFragment2,bun)
        }

    }

}