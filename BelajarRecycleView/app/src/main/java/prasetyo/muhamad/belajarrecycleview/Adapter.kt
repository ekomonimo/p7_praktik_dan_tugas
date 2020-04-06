package prasetyo.muhamad.belajarrecycleview

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list.view.*



class Adapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder{
        return holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int=list.size

    override fun onBindViewHolder(holder: holder, position: Int){
        holder.view.lbList.text=list.get(position).name
    }

    class holder(val view: View) : RecyclerView.ViewHolder(view)
}