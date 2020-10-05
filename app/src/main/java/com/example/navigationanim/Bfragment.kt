package com.example.navigationanim

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationanim.recycler2.AnimalsAdapter
import kotlinx.android.synthetic.main.fragment_bfragment.*


class Bfragment : Fragment() {

    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bfragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        recyclerAnimal.adapter = AnimalsAdapter(MockData.getAnimals()) {
            parentFragment?.view?.let { it1 ->

                val bundle = Bundle()
                bundle.putString("img", it.animPhoto)
                bundle.putString("title", it.animTitle)
                bundle.putString("detail", it.animDetail)

                Navigation.findNavController(it1)
                    .navigate(R.id.action_bfragment_to_CFragment, bundle)
                Toast.makeText(view.context, "Tiklandi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}