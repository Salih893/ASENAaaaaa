package com.asena.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(15, 20, 35))
            setPadding(24, 24, 24, 24)
        }

        val title = TextView(this).apply {
            text = "ASENA"
            textSize = 36f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Merhaba! Ben ASENA. Sana nasıl yardımcı olabilirim?"
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(12, 24, 12, 24)
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
