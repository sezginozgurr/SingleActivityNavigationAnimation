package com.example.navigationanim

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationanim.recycler1.MyChildAdapter
import kotlinx.android.synthetic.main.fragment_dialog.*


open class DialogFr : DialogFragment() {

    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        object : CountDownTimer(1000, 1000) {
            override fun onFinish() {
                Log.d("TAG", "recycler")
                recyclerChild.adapter = MyChildAdapter(MockData.getPhotoList()) {
                    Log.d("TAG", "click")
                    navController?.navigate(R.id.action_navigation_dialog_to_CFragment)
                    parentFragment?.view?.let { it1 ->
                        Navigation.findNavController(it1)
                            .navigate(R.id.action_navigation_dialog_to_CFragment)
                    }

                }
            }

            override fun onTick(millisUntilFinished: Long) {}
        }.start()

        btnCancel.setOnClickListener { dismiss() }
        btnSave.setOnClickListener {
            Log.d("TAG", "onViewCreated: LUL")
        }
    }
}