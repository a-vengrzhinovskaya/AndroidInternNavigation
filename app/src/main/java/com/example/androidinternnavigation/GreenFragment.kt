package com.example.androidinternnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidinternnavigation.databinding.FragmentGreenBinding

class GreenFragment : BaseFragment<FragmentGreenBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentGreenBinding
        get() = FragmentGreenBinding::inflate

    override fun navButtonSetOnClick() {
        binding.btGreen.setOnClickListener {
            findNavController().navigate(R.id.action_frGreen_to_frBlue)
        }
    }

}