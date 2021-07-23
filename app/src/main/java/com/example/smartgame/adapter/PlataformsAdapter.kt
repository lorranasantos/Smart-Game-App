package com.example.smartgame.adapter

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.smartgame.R
import com.example.smartgame.model.Games
import com.example.smartgame.model.Plataform
import com.example.smartgame.ui.GameInformation
import java.util.*

class PlataformsAdapter(val context:Context): RecyclerView.Adapter<PlataformsAdapter.Holder>() {

    var listGames = Collections.emptyList<Plataform>()

    fun updateGame(list: List<Plataform>) {
        listGames = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlataformsAdapter.Holder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.holder_plataforms_list, parent, false)

        return PlataformsAdapter.Holder(view)
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    override fun onBindViewHolder(holder: PlataformsAdapter.Holder, position: Int) {
        val gameInfo = listGames[position]

        holder.gameName.text = gameInfo.name

    }

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val gameName = view.findViewById<TextView>(R.id.text_view_plataforms)
    }
}