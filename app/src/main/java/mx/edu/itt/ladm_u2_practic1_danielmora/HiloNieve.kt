package mx.edu.itt.ladm_u2_practic1_danielmora

class HiloNieve (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()

        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.miLienzo!!.animarNieve()
            }
        }
    }
}