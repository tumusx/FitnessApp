package com.silva.murillo.fitnessapp.ui.view.adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.silva.murillo.fitnessapp.R

class AdapterOnboarding(
    private var tittle: List<String>,
    private var details: List<String>,
    private var image: List<Int>,
) :
    RecyclerView.Adapter<AdapterOnboarding.Pager2ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): AdapterOnboarding.Pager2ViewHolder {
        return Pager2ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_list_onboarding, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AdapterOnboarding.Pager2ViewHolder, position: Int) {
    holder.itemTitle.text = tittle[position]
        holder.itemDescripion.text = details[position]
        holder.imageView.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return tittle.size
    }

    inner class Pager2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.tittleObjective)
        val itemDescripion: TextView = itemView.findViewById(R.id.textView)
        val imageView: ImageView = itemView.findViewById(R.id.imagePerson)

        init {
            imageView.setOnClickListener{v: View->
                val position = adapterPosition
                Toast.makeText(imageView.context, "Voce clicou no #${position+1}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}