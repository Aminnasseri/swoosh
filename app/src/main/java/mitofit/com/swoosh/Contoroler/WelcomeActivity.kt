package mitofit.com.swoosh.Contoroler

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mitofit.com.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_getStarted.setOnClickListener{
            val intentleague = Intent(this, LeagueActivity::class.java)
            startActivity(intentleague)
        }



    }
}
