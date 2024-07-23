package com.nokhaiz.indexedrecyclerviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nokhaiz.indexedrecyclerview.IndexedRecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        IndexedRecyclerView.printLog("NokhaizIndexedRecyclerView","This is checking the log from IndexedRecyclerView")
    }
}