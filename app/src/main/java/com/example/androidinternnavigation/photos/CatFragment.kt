package com.example.androidinternnavigation.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentCatBinding

private const val CAT_IMAGE_URL = "https://litbro.ru/wp-content/uploads/2020/06/CHerno-belye-koshki-1.jpg"

class CatFragment : BaseFragment<FragmentCatBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCatBinding
        get() = FragmentCatBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setImage()
    }

    private fun setImage() {
        Glide
            .with(binding.root)
            .load(CAT_IMAGE_URL)
            .into(binding.ivCat)
    }
}