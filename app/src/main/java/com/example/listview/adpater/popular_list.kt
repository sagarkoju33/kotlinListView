import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listview.CityDetailActivity
import com.example.listview.R
import com.example.listview.model.PopularItem


class PopularAdapter(private val items: List<PopularItem>) :
    RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    class PopularViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tvCityName)
        val des: TextView = view.findViewById(R.id.tvCityDes)
        val prices: TextView = view.findViewById(R.id.price)
        val thumbnail: ImageView = view.findViewById(R.id.imageView)
        val rating: TextView = view.findViewById(R.id.starContainer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return PopularViewHolder(view)
    }


    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.des.text = item.description
        holder.prices.text =
            holder.itemView.context.getString(R.string.price_format, item.price.toString())
        holder.rating.text =
            holder.itemView.context.getString(R.string.rating, item.rating.toString())

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, CityDetailActivity::class.java).apply {
                putExtra("city_name", item.title)
                putExtra("city_description", item.description)
                putExtra("city_image", item.thumbnail)
                putExtra("city_price", item.price.toString())
            }
            holder.itemView.context.startActivity(intent)
        }


        // Load image using Glide (add Glide dependency in build.gradle)
        Glide.with(holder.itemView.context)
            .load(item.thumbnail)
            .into(holder.thumbnail)
    }

    override fun getItemCount(): Int = items.size
}

