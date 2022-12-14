package com.example.androidinternnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.androidinternnavigation.databinding.FragmentRedBinding

class RedFragment : BaseFragment<FragmentRedBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentRedBinding
        get() = FragmentRedBinding::inflate

    override fun setupListeners() {
        binding.btRed.setOnClickListener {
            findNavController().navigate(R.id.action_frRed_to_frGreen)
        }
    }
}