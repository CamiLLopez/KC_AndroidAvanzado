package com.example.kccentregaandroidavanzado.UI

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kccentregaandroidavanzado.R
import com.example.kccentregaandroidavanzado.UI.viewModels.HerosViewModel
import com.example.kccentregaandroidavanzado.databinding.ActivityMainBinding
import com.example.kccentregaandroidavanzado.databinding.HerosContentActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HerosListViewActivity: AppCompatActivity() {


    private lateinit var binding: HerosContentActivityBinding
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val viewModel: HerosViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HerosContentActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: Toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        navController.navigate(R.id.herosListFragment)
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}