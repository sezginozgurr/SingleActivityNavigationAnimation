package com.example.navigationanim.recycler2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigationanim.R

class AnimalsAdapter(
    private val animalsList: List<AnimalsModel>,
    private val onClick: (AnimalsModel) -> Unit
) :
    RecyclerView.Adapter<AnimalsAdapter.AnimalsHolder>() {

    class AnimalsHolder(container: ViewGroup) :
        RecyclerView.ViewHolder(
            LayoutInflater.from(container.context)
                .inflate(R.layout.row_item_animal, container, false)
        ) {
        private val animPhoto = itemView.findViewById(R.id.animalsPhoto) as ImageView
        private val animTitle = itemView.findViewById(R.id.animalsTitle) as TextView
        private val animDetail = itemView.findViewById(R.id.animalsDetail) as TextView

        fun bind(animalsModel: AnimalsModel, onClick: (AnimalsModel) -> Unit) {
            Glide.with(itemView.context).load(animalsModel.animPhoto).into(animPhoto)
            animTitle.text = animalsModel.animTitle
            animDetail.text = animalsModel.animDetail
            itemView.setOnClickListener { onClick(animalsModel) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsHolder {
        return AnimalsHolder(parent)
    }

    override fun onBindViewHolder(holder: AnimalsHolder, position: Int) {
        holder.bind(animalsList[position], onClick)
    }

    override fun getItemCount(): Int = animalsList.size
}