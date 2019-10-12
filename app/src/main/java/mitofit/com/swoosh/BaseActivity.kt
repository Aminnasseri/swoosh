package mitofit.com.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val Tag ="LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(Tag, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    override fun onStart() {
        Log.d(Tag, "${javaClass.simpleName} onStart")
        super.onStart()

    }

    override fun onResume() {
        Log.d(Tag,"${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(Tag,"${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(Tag,"${javaClass.simpleName} onPause")
        super.onPause()

    }

    override fun onStop() {
        Log.d(Tag,"${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag,"${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }


}
