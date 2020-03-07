package mx.edu.itt.ladm_u2_practic1_danielmora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var miLienzo :Lienzo ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        miLienzo=Lienzo(this)
        setContentView(miLienzo)
        HiloNieve(this).start()

    }
}
