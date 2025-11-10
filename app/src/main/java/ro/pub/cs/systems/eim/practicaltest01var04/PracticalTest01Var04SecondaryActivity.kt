package ro.pub.cs.systems.eim.practicaltest01var04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var04SecondaryActivity: AppCompatActivity() {
    private lateinit var input1: TextView
    private lateinit var input2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var04_secondary)

        val text1 = intent.getStringExtra("input1")
        val text2 = intent.getStringExtra("input2")
        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        input1.text = text1
        input2.text = text2

        findViewById<Button>(R.id.ok).setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra("result", "ok"))
            finish()
        }

        findViewById<Button>(R.id.cancel).setOnClickListener {

            setResult(RESULT_OK, Intent().putExtra("result", "cancel"))
            finish()
        }
    }
}