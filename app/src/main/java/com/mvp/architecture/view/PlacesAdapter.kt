package com.mvp.architecture.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mvp.architecture.R
import com.mvp.architecture.model.Places


class PlacesAdapter(private val places: List<Places>) :
    RecyclerView.Adapter<PlacesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_visit_place_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }

    override fun getItemCount() = places.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(place: Places) {
            Glide.with(itemView.context)
                .load(place.image)
                .placeholder(R.drawable.ic_default_image)
                .into(itemView.findViewById(R.id.image))

            itemView.findViewById<TextView>(R.id.text_view_location).text = place.location
            itemView.findViewById<TextView>(R.id.text_view_des).text = place.description
        }
    }
}
