package com.example.demokotlin

import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_bottom_navigation.*


class BottomNavigationclass : AppCompatActivity(), HomeFragment.OnFragmentInteractionListener,
    ContactFragment.OnFragmentInteractionListener, AboutFragment.OnFragmentInteractionListener,
    NavigationView.OnNavigationItemSelectedListener {


    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
               /* val firstFragment = HomeFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.layout_frame, firstFragment)
                transaction.commit()*/
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
               // val about = AboutFragment()
                //supportFragmentManager.beginTransaction().replace(R.id.layout_frame, about).addToBackStack(null).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
              //  val contact = ContactFragment()
               // supportFragmentManager.beginTransaction().replace(R.id.layout_frame, contact).addToBackStack(null).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

       // val drawerLayout2: DrawerLayout = findViewById(R.id.drawer_layout2)
       // val navView2: NavigationView = findViewById(R.id.nav_view2)
        this.setTitle("Home")
       //val toolbar: Toolbar = findViewById(R.id.toolbar2)

        //setSupportActionBar(toolbar)

       /* val toggle = ActionBarDrawerToggle(
            this, drawer_layout2, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout2.addDrawerListener(toggle)
        toggle.syncState()*/

       /* val firstFragment = HomeFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.layout_frame, firstFragment)
        transaction.commit()*/



        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        //navView2.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
               /* val firstFragment = HomeFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.layout_frame, firstFragment)
                transaction.commit()*/
            }
            R.id.nav_gallery -> {
              //  val about = AboutFragment()
               // supportFragmentManager.beginTransaction().replace(R.id.layout_frame, about).addToBackStack(null).commit()
            }
            R.id.nav_slideshow -> {
               // val contact = ContactFragment()
               // supportFragmentManager.beginTransaction().replace(R.id.layout_frame, contact).addToBackStack(null).commit()
            }
            R.id.nav_tools -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }
      /*  val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout2)
        drawerLayout.closeDrawer(GravityCompat.START)*/
        return true
    }
}
