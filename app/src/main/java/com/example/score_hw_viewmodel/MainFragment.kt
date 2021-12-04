package com.example.score_hw_viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.score_hw_viewmodel.databinding.FragmentMainBinding
import com.example.score_hw_viewmodel.model.ScoreViewModel

class MainFragment : Fragment() {

private var _binding: FragmentMainBinding? =null
    private val binding get() = _binding
    private val viewModel:ScoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    fun Updatescore() {
        binding?.scoreResult?.text = viewModel.score.toString()}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentMainBinding.inflate(inflater,container,false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Updatescore()
        binding?.scoreOne?.setOnClickListener {
            viewModel.getScoreAddOne()
            Updatescore()
        }
        binding?.scoreTwo?.setOnClickListener {
            viewModel.getScoreAddFour()
            Updatescore()
        }
        binding?.scoreThree?.setOnClickListener {
            viewModel.getScoreSubTwo()
            Updatescore()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}