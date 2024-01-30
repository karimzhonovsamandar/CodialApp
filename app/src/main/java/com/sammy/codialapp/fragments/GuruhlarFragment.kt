package com.sammy.codialapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sammy.codialapp.R
import com.sammy.codialapp.databinding.FragmentGuruhlarBinding


class GuruhlarFragment : Fragment() {

    private lateinit var binding: FragmentGuruhlarBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuruhlarBinding.inflate(layoutInflater)





        return binding.root
    }

}