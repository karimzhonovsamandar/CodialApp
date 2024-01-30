package com.sammy.codialapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sammy.codialapp.R
import com.sammy.codialapp.databinding.FragmentMentorlarBinding
import com.sammy.codialapp.databinding.FragmentSplashBinding

class MentorlarFragment : Fragment() {

    private lateinit var binding: FragmentMentorlarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMentorlarBinding.inflate(layoutInflater)





        return binding.root
    }


}
