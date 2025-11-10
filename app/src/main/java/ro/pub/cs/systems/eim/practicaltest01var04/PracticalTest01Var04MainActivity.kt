package ro.pub.cs.systems.eim.practicaltest01var04

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var04MainActivity : AppCompatActivity() {

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var label: TextView
    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox

    private var check1_on = false
    private var check2_on = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var04_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        label = findViewById(R.id.label)
        check1 = findViewById(R.id.check1)
        check2 = findViewById(R.id.check2)


        check1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (!check1_on) {
                check1_on = true
            }
            else {
                check1_on = false
            }
        }
        check2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (!check2_on) {
                check2_on = true
            }
            else {
                check2_on = false
            }
        }
        findViewById<Button>(R.id.set).setOnClickListener {
            if ((check1_on && input1.text.toString().isEmpty()) or (check2_on && input2.text.toString().isEmpty())) {
                Toast.makeText(this, "checkbox not selected", Toast.LENGTH_LONG).show()
            }
            else if (check1_on) {
                label.text = input1.text.toString()
            }
            else if (check2_on){
                label.text = input2.text.toString()
            }
            else if (!check1_on && !check2_on){
                label.text = "PerfectStudent341C1"
            }
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putString("input1", input1.toString())
//        outState.putString("input2", input2.toString())
//        outState.putString("label", label.toString())
//    }
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState);
//
//        // Read the state of textview
//        binding.textView.text = savedInstanceState.getString("input1")
//    }


}