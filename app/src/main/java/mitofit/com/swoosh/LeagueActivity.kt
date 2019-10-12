package mitofit.com.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        val intentSkill = Intent(this,SkillActivity::class.java)
        startActivity(intentSkill)
    }
}
