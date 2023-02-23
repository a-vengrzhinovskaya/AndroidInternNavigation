package com.example.androidinternnavigation.colors

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentWhiteBinding

class WhiteFragment : BaseFragment<FragmentWhiteBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentWhiteBinding
        get() = FragmentWhiteBinding::inflate
}