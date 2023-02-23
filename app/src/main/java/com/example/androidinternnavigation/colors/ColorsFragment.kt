package com.example.androidinternnavigation.colors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentColorsBinding
import com.google.android.material.tabs.TabLayoutMediator

class ColorsFragment : BaseFragment<FragmentColorsBinding>() {
    private val tabNames = listOf("white", "red")

    private lateinit var adapter: ColorsAdapter
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentColorsBinding
        get() = FragmentColorsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPager()
        setupTabs()
    }

    private fun setupPager() {
        adapter = ColorsAdapter(this)
        binding.pagerColors.adapter = adapter
    }

    private fun setupTabs() {
        TabLayoutMediator(binding.tabColors, binding.pagerColors) { tab, position ->
            tab.text = tabNames[position]
        }.attach()
    }
}