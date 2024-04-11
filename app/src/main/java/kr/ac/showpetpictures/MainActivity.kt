package kr.ac.showpetpictures

import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var checkStart : Switch
    lateinit var rg : RadioGroup
    lateinit var linearSub : LinearLayout
//    lateinit var radioDog : RadioButton
//    lateinit var radioKitty : RadioButton
//    lateinit var radioSnake : RadioButton
//    lateinit var btnDone : Button
    lateinit var imgV : ImageView
    lateinit var btnFinish : Button
    lateinit var btnInit : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkStart = findViewById<Switch>(R.id.checkStart)
        rg = findViewById<RadioGroup>(R.id.rg)
        linearSub = findViewById<LinearLayout>(R.id.linearSub)
//        btnDone = findViewById<Button>(R.id.btnDone)
        imgV = findViewById<ImageView>(R.id.imgV)
        btnFinish = findViewById(R.id.btnFinish)
        btnInit = findViewById(R.id.btnInit)

        btnFinish.setOnClickListener(btnListnear)
        btnInit.setOnClickListener(btnListnear)

        linearSub.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                linearSub.visibility= View.VISIBLE
            }else{
                linearSub.visibility= View.INVISIBLE
            }

        }
//        btnDone.setOnClickListener {
//            when(rg.checkedRadioButtonId){
//                R.id.radioPuppy -> imgV.setImageResource(R.drawable.dog)
//                R.id.radioKitty -> imgV.setImageResource(R.drawable.cat)
//                R.id.radioSnake -> imgV.setImageResource(R.drawable.snake)
//            }
//        }
            rg.setOnCheckedChangeListener { buttonView, isChecked ->
                when(rg.checkedRadioButtonId){
                    R.id.radioPuppy -> imgV.setImageResource(R.drawable.dog)
                    R.id.radioKitty -> imgV.setImageResource(R.drawable.cat)
                    R.id.radioSnake -> imgV.setImageResource(R.drawable.snake)
                }
        }
    }

    val btnListnear = OnClickListener{
        when(it.id){
            R.id.btnFinish ->finish()
            R.id.btnInit ->{
                checkStart.isChecked = false
                linearSub.visibility = INVISIBLE
            }
        }
    }
}