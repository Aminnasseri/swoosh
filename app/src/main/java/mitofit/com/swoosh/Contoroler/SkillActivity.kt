package mitofit.com.swoosh.Contoroler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import mitofit.com.swoosh.Model.Player

import mitofit.com.swoosh.R
import mitofit.com.swoosh.Utilities.EXTRA_PLAYER


class SkillActivity : BaseActivity() {
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)


    }

    fun onSkillFinishClicked(view: View) {

        if (player.skill != "") {

            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)


            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select level",Toast.LENGTH_SHORT).show()
        }

    }


    fun biginner(view: View) {
        btn_baller.isChecked = false
        player.skill = "Beginner"

    }

    fun baller(view: View) {
        btn_beginner.isChecked = false
        player.skill= "Baller"


    }


}
