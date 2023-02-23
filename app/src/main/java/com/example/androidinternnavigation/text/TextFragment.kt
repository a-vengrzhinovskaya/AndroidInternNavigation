package com.example.androidinternnavigation.text

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentTextBinding

class TextFragment : BaseFragment<FragmentTextBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTextBinding
        get() = FragmentTextBinding::inflate
}