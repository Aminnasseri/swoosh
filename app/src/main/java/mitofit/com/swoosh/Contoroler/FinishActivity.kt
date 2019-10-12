package mitofit.com.swoosh.Contoroler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import mitofit.com.swoosh.R
import mitofit.com.swoosh.Utilities.EXTRA_LEAGUE
import mitofit.com.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        txt_SearchLeague.text="Looking for $league $skill league near you...."

    }
}
