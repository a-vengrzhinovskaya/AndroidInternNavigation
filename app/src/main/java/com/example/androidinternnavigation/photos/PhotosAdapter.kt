package com.example.androidinternnavigation.photos

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val ITEMS_COUNT = 2

class PhotosAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = ITEMS_COUNT

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) CatFragment() else DogFragment()
    }
}