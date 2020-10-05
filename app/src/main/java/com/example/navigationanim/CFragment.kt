package com.example.navigationanim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_c.*


class CFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(requireContext()).load(arguments?.getString("img"))
            .into(detailImage)
        detailTitle.text = arguments?.getString("detail")

        /*val bundle = Bundle()
        bundle.getString("img", R.drawable.ic_baseline_airline_seat_individual_suite_24.toString())*/

    }

}