package com.example.rv3.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rv3.databinding.ItemRvBinding
import com.example.rv3.models.Flag

private const val TAG = "FlagAdapter"
class FlagAdapter(var context: Context, var list:ArrayList<Flag>): RecyclerView.Adapter<FlagAdapter.Vh>() {
    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(flag: Flag, position: Int){
            itemRvBinding.image.setImageResource(flag.image)
            itemRvBinding.name.text = flag.name
            Log.d(TAG, "onBind: $position")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }
}