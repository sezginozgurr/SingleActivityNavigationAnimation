package com.example.navigationanim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : Fragment() {


    private var navController: NavController? = null
    private val sharedPrefences by lazy {
        requireActivity().getSharedPreferences(
            "login",
            AppCompatActivity.MODE_PRIVATE
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        navController?.navigate(R.id.navigation_dialog)
        btnLogin.setOnClickListener {
            val editor = sharedPrefences.edit()
            if (remember.isChecked)
                editor.putString("tckimlik", userName.text.toString()).apply()
            else
                editor.putString("tckimlik", "").apply()

            navController?.navigate(R.id.action_AFragment_to_bfragment)
        }
        val tckimlik = sharedPrefences.getString("tckimlik", "")
        if (!tckimlik.isNullOrEmpty()) {
            remember.isChecked = true
            userName.setText(tckimlik)
        }

    }

}
