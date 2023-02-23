package com.example.androidinternnavigation.colors

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val ITEMS_COUNT = 2

class ColorsAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = ITEMS_COUNT

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) WhiteFragment() else RedFragment()
    }
}