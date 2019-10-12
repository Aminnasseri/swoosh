package mitofit.com.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val intentSkill = Intent(this, SkillActivity::class.java)
            intentSkill.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(intentSkill)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }


        fun onMensClicked(view: View) {
            btn_womens.isChecked = false
            btn_coed.isChecked = false

            selectedLeague = "Mens"
        }

        fun onWomensClicked(view: View) {
            btn_mens.isChecked = false
            btn_coed.isChecked = false

            selectedLeague = "Womens"


        }

        fun onCoClicked(view: View) {
            btn_mens.isChecked = false
            btn_womens.isChecked = false

            selectedLeague = "Coed"

        }

    }



