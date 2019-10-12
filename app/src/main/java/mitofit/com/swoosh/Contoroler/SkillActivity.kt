package mitofit.com.swoosh.Contoroler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import mitofit.com.swoosh.Utilities.EXTRA_LEAGUE
import mitofit.com.swoosh.R
import mitofit.com.swoosh.Utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {
    var selectedSkill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

    }

    fun onSkillFinishClicked(view: View) {

        if (selectedSkill != "") {

            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,selectedSkill)

            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select level",Toast.LENGTH_SHORT).show()
        }

    }


    fun biginner(view: View) {
        btn_baller.isChecked = false
        selectedSkill = "Beginner"

    }

    fun baller(view: View) {
        btn_beginner.isChecked = false
        selectedSkill = "Baller"


    }


}
