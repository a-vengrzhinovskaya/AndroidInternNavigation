package com.example.androidinternnavigation.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentPhotosBinding
import com.google.android.material.tabs.TabLayoutMediator

class PhotosFragment : BaseFragment<FragmentPhotosBinding>() {
    private val tabNames = listOf("cat", "dog")

    private lateinit var adapter: PhotosAdapter
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentPhotosBinding
        get() = FragmentPhotosBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPager()
        setupTabs()
    }

    private fun setupPager() {
        adapter = PhotosAdapter(this)
        binding.pagerPhotos.adapter = adapter
    }

    private fun setupTabs() {
        TabLayoutMediator(binding.tabPhotos, binding.pagerPhotos) { tab, position ->
            tab.text = tabNames[position]
        }.attach()
    }
}