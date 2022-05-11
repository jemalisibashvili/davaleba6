package com.example.davaleba6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomnavigationView: BottomNavigationView
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomnavigationView = findViewById(R.id.bottomNavView)
        navController = findNavController(R.id.navHostFragment)

        setupActionBarWithNavController(navController, AppBarConfiguration(
            setOf(R.id.homeFragment,
            R.id.dashboardFragment,
            R.id.notificationFragment,
            R.id.settingsFragment)
        ))
        bottomnavigationView.setupWithNavController(navController)
    }



}