package com.promedia.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.promedia.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.toolbar.setLogo(R.drawable.cam_icon)
        b.toolbar.setOnMenuItemClickListener{ item ->
            when (item.itemId){
                R.id.chats -> Snackbar.make(b.root, "CHATS", Snackbar.LENGTH_SHORT).show()
                R.id.calls -> Snackbar.make(b.root, "LLAMADAS", Snackbar.LENGTH_SHORT).show()
                R.id.contacts -> Snackbar.make(b.root, "CONTACTOS", Snackbar.LENGTH_SHORT).show()
            }
            true
        }


    }

    // Método para inflar el menú de opciones cuando
    // el usuario abre el menú por primera vez
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Método para controlar las operaciones que cuando
    // el usuario haga clic en los botones de acción
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
            R.id.newGroup-> Toast.makeText(this, "Crear nuevo grupo", Toast.LENGTH_SHORT).show()
            R.id.newDifusion -> Toast.makeText(this, "Crear nueva difusión", Toast.LENGTH_SHORT).show()
            R.id.vinculatedDisp -> Toast.makeText(this, "Dispositivos vinculados", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "Abrir ajustes", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
