package com.example.kccentregaandroidavanzado.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kccentregaandroidavanzado.R
import com.example.kccentregaandroidavanzado.SuperHero

class SuperHeroAdapter(private val onClick: (String)-> (Unit)):
  ListAdapter<SuperHero, SuperHeroAdapter.SuperHeroViewHolder>(SuperHeroDiffCallBack()) {



  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_item_hero, parent, false)
      return SuperHeroViewHolder(view)
  }

  override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
      holder.bind(getItem(position))
  }




  inner class SuperHeroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {

      private val heroName = itemView.findViewById<TextView>(R.id.hero_name)

      private lateinit var hero: SuperHero


      init {
          itemView.setOnClickListener {
            onClick(hero.id)
          }
      }

    fun bind(hero: SuperHero){
      this.hero = hero
      heroName.text = hero.name
    }


  }

  class SuperHeroDiffCallBack: DiffUtil.ItemCallback<SuperHero>() {
    override fun areItemsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
      return oldItem.id ==newItem.id

    }

    override fun areContentsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
      return oldItem == newItem
    }

  }
}