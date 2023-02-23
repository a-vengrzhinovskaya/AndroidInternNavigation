package com.example.androidinternnavigation.colors

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentRedBinding

class RedFragment : BaseFragment<FragmentRedBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentRedBinding
        get() = FragmentRedBinding::inflate
}