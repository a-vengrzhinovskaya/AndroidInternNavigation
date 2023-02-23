package com.example.androidinternnavigation.photos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.androidinternnavigation.BaseFragment
import com.example.androidinternnavigation.databinding.FragmentDogBinding

private const val DOG_IMAGE_URL = "https://bosch-club.ru/upload/iblock/064/064330f5a09fead910212f7addf5407f.jpg"

class DogFragment : BaseFragment<FragmentDogBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDogBinding
        get() = FragmentDogBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setImage()
    }

    private fun setImage() {
        Glide
            .with(binding.root)
            .load(DOG_IMAGE_URL)
            .into(binding.ivDog)
    }
}