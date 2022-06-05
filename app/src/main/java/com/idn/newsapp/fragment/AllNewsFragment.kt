package com.idn.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.newsapp.data.DataNews
import com.idn.newsapp.adapter.NewsAdapter
import com.idn.newsapp.bindNewsHeadline
import com.idn.newsapp.databinding.FragmentAllNewsBinding

class AllNewsFragment : Fragment() {

    private lateinit var binding : FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllNewsBinding.inflate(inflater,container,false)
        binding.rvAllNews.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

        bindNewsHeadline(binding.newsHeadline,0)
        return binding.root
    }
}