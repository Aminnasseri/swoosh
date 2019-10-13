package mitofit.com.swoosh.Contoroler

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import mitofit.com.swoosh.Model.Player

import mitofit.com.swoosh.R
import mitofit.com.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {
    var player= Player ("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val intentSkill = Intent(this, SkillActivity::class.java)
            intentSkill.putExtra(EXTRA_PLAYER,player)
            startActivity(intentSkill)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }


        fun onMensClicked(view: View) {
            btn_womens.isChecked = false
            btn_coed.isChecked = false

          player.league = "Mens"
        }

        fun onWomensClicked(view: View) {
            btn_mens.isChecked = false
            btn_coed.isChecked = false

            player.league = "Womens"


        }

        fun onCoClicked(view: View) {
            btn_mens.isChecked = false
            btn_womens.isChecked = false

           player.league = "Coed"

        }

    }



