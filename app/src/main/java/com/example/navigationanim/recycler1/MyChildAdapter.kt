package com.example.navigationanim.recycler1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationanim.R

class MyChildAdapter(
    private val childList: ArrayList<MyChildModel>,
    private val onClick: (MyChildModel) -> Unit
) :
    RecyclerView.Adapter<MyChildAdapter.ParentChooseChildHolder>() {

    class ParentChooseChildHolder(container: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate(
            R.layout.row_item_choose_child,
            container,
            false
        )
    ) {
        private val imageChild = itemView.findViewById(R.id.childImage) as ImageView
        private val txtChildName = itemView.findViewById(R.id.titleChild) as TextView

        fun bind(myChildModel: MyChildModel, onClick: (MyChildModel) -> Unit) {
            imageChild.setImageResource(myChildModel.childImg)
            txtChildName.text = myChildModel.txtChildName
            itemView.setOnClickListener { onClick(myChildModel) }
        }
    }

    fun addChild(myChildModel: MyChildModel) {
        childList.add(0, myChildModel)
        Log.d("TAG", "addChild: Item added")
        notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentChooseChildHolder {
        return ParentChooseChildHolder(parent)
    }

    override fun onBindViewHolder(holder: ParentChooseChildHolder, position: Int) {
        holder.bind(childList[position], onClick)
    }

    override fun getItemCount(): Int = childList.size
}