package com.example.ramyeon_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ramyeon_app.databinding.FragmentLoginBinding
import kotlin.math.log

class LoginFragment : Fragment() {

    lateinit var  loginFragmentBinding : FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        loginFragmentBinding = FragmentLoginBinding.inflate(inflater)
        loginFragmentBinding.loginToolbar.title = "LOGIN"   // title 설정

        loginFragmentBinding.loginSignupBtn.setOnClickListener{
            val act = activity as MainActivity
            act.fragmentController("signup", true, true)
        }

        loginFragmentBinding.loginLoginBtn.setOnClickListener{
            val boardMainIntent = Intent(requireContext(), BoardMainActivity::class.java)
            startActivity(boardMainIntent)
            activity?.finish()  // 로그인 관련 액티비티 종료 - 뒤로가기 눌러도 안나옴
        }

        return loginFragmentBinding.root
    }
}