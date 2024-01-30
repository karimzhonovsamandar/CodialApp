package com.sammy.codialapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sammy.codialapp.R
import com.sammy.codialapp.databinding.FragmentKurslarBinding


class KurslarFragment : Fragment() {

    private lateinit var binding: FragmentKurslarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKurslarBinding.inflate(layoutInflater)





        return binding.root
    }

}