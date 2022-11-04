package com.example.ramyeon_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ramyeon_app.databinding.FragmentLoginBinding
import com.example.ramyeon_app.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    lateinit var signupFragmentBinding : FragmentSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        signupFragmentBinding = FragmentSignupBinding.inflate(inflater)
        signupFragmentBinding.signupToolbar.title = "signup"

        signupFragmentBinding.signupNextbtn.setOnClickListener {
            val act = activity as MainActivity
            act.fragmentController("nickname", true, true)
        }

        return signupFragmentBinding.root
    }
}