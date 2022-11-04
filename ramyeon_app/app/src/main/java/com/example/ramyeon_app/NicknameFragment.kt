package com.example.ramyeon_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ramyeon_app.databinding.FragmentLoginBinding
import com.example.ramyeon_app.databinding.FragmentNicknameBinding

class NicknameFragment : Fragment() {

    lateinit var nickNameFragmentBinding : FragmentNicknameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        nickNameFragmentBinding = FragmentNicknameBinding.inflate(inflater)

        nickNameFragmentBinding.nicknameToolbar.title = "set your nickname"

        nickNameFragmentBinding.nicknameSignupbtn.setOnClickListener{
            val mainIntent = Intent(requireContext(), MainActivity::class.java)
            startActivity(mainIntent)
            activity?.finish()      // 현재 액티비티 종료
        }

        return nickNameFragmentBinding.root
    }
}