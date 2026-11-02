package ru.pelmen.vpn

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(12, 16, 20)
        window.navigationBarColor = Color.rgb(12, 16, 20)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(12, 16, 20))
        }

        val title = TextView(this).apply {
            text = "PELМEN VPN"
            textSize = 32f
            setTextColor(Color.rgb(80, 230, 140))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "YOUR PRIVATE CONNECTION"
            textSize = 12f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "● Отключено"
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 45, 0, 35)
        }

        val connect = Button(this).apply {
            text = "НАСТРОИТЬ WIREGUARD"
            textSize = 15f
            setOnClickListener {
                status.text = "Ожидает настройки сервера"
            }
        }

        val server = TextView(this).apply {
            text = "Сервер: Pelmen Server"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 35, 0, 10)
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(status)
        root.addView(connect)
        root.addView(server)

        setContentView(root)
    }
}
