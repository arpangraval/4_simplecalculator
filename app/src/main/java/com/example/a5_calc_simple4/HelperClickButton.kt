package com.example.a5_calc_simple4

import android.view.View
import android.widget.Toast

class HelperClickButton : View.OnClickListener {
    override fun onClick(v: View?) {
        val view = v?.rootView
        when(v?.id){
            R.id.btnAdd-> Toast.makeText(v.context,(R.id.etNo1.toString().toInt() + R.id.etNo2.toString().toInt()).toString(),Toast.LENGTH_LONG).show()
            R.id.btnSub-> Toast.makeText(v.context,"Subtraction", Toast.LENGTH_LONG).show()
        }
    }
}