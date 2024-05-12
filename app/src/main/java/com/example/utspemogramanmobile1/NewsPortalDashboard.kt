package com.example.utspemogramanmobile1;

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewsPortalDashboard : AppCompatActivity() {

    private lateinit var listViewComponent: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_portal_dashboard)

        listViewComponent = findViewById(R.id.list_view_component)


        val newsData = arrayOf(
            "i9-14900K",
            "GeForce RTX 3090",
            "VENGEANCE® 32GB (2x16GB) DDR5 DRAM",
            "970 EVO NVMe® M.2 SSD 1TB",
            "Tiansu 2K Monitor 24 inch 165hz"
        )


        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            newsData
        )


        listViewComponent.adapter = adapter


        listViewComponent.setOnItemClickListener { parent, view, position, id ->
            val selectedNews = adapter.getItem(position)
            Toast.makeText(
                this@NewsPortalDashboard,
                "Berita terpilih: $selectedNews",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
