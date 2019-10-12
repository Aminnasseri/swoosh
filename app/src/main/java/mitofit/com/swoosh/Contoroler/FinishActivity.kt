package mitofit.com.swoosh.Contoroler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import mitofit.com.swoosh.Model.Player
import mitofit.com.swoosh.R

import mitofit.com.swoosh.Utilities.EXTRA_PLAYER


class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        txt_SearchLeague.text="Looking for ${player.league} ${player.skill} league near you...."

    }
}
