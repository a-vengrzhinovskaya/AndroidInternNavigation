package com.example.androidinternnavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidinternnavigation.databinding.FragmentBlueBinding

class BlueFragment : BaseFragment<FragmentBlueBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBlueBinding
        get() = FragmentBlueBinding::inflate

    override fun navButtonSetOnClick() {}
}