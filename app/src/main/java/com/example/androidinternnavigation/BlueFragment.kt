package com.example.androidinternnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.androidinternnavigation.databinding.FragmentBlueBinding

class BlueFragment : BaseFragment<FragmentBlueBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBlueBinding
        get() = FragmentBlueBinding::inflate

    override fun setupListeners() {
        Toast.makeText(requireContext(), getString(R.string.last_fragment), Toast.LENGTH_SHORT).show()
    }

}