package kr.ac.showpetpictures

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var checkStart : CheckBox
    lateinit var rg : RadioGroup
    lateinit var linearSub : LinearLayout
    lateinit var radioDog : RadioButton
    lateinit var radioKitty : RadioButton
    lateinit var radioSnake : RadioButton
    lateinit var btnDone : Button
    lateinit var imgV : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkStart = findViewById<CheckBox>(R.id.checkStart)
        rg = findViewById<RadioGroup>(R.id.rg)
        linearSub = findViewById<LinearLayout>(R.id.linearSub)
        btnDone = findViewById<Button>(R.id.btnDone)
        imgV = findViewById<ImageView>(R.id.imgV)

        linearSub.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                linearSub.visibility= View.VISIBLE
            }else{
                linearSub.visibility= View.INVISIBLE
            }

        }
        btnDone.setOnClickListener {
            when(rg.checkedRadioButtonId){
                R.id.radioPuppy -> imgV.setImageResource(R.drawable.dog)
                R.id.radioKitty -> imgV.setImageResource(R.drawable.cat)
                R.id.radioSnake -> imgV.setImageResource(R.drawable.snake)
            }
        }
    }
}