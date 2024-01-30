package com.sammy.codialapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sammy.codialapp.R
import com.sammy.codialapp.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater)

        binding.apply {
            coursesButton.setOnClickListener {
                findNavController().navigate(R.id.kurslarFragment)
            }
            groupsButton.setOnClickListener {
                findNavController().navigate(R.id.guruhlarFragment)
            }
            mentorsButton.setOnClickListener {
                findNavController().navigate(R.id.mentorlarFragment)
            }
        }


        return binding.root
    }

}
