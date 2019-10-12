package mitofit.com.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity :BaseActivity() {
    var selectedSkill =""
    var league= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

    }
    fun biginner(view: View){
        btn_baller.isChecked = false
        selectedSkill ="Biginner"

    }

    fun baller (view: View){
        btn_biginner.isChecked = false
        selectedSkill = "Baller"


    }


}
