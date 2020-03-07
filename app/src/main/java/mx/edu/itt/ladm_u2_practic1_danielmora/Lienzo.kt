package mx.edu.itt.ladm_u2_practic1_danielmora


import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


class Lienzo(p:MainActivity):View(p){


    var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    var sol   = PropFiguras(1000,50,120)

    var nube1 = PropFiguras(120,300,80)
    var nube2 = PropFiguras(150,280,80)
    var nube3 = PropFiguras(180,320,80)
    var nube4 = PropFiguras(220,330,80)

    var tierra = PropFiguras(0,1750,1080,1536)

    var tronco = PropFiguras(100,1800,150,250)
    var arbolCopa=PropFiguras(80,1790,80)
    var arbolCopa2=PropFiguras(160,1800,80)
    var arbolCopa3=PropFiguras(160,1800,80)
    var arbolCopa4=PropFiguras(200,1700,80)

    var TechoCasa = PropFiguras(380, 1600, 690, 1400, 1000, 1600)
    var BaseCasa =PropFiguras(400,1600,580,500)
    var VentCasa=PropFiguras(480,1750,60)
    var puertCasa=PropFiguras(550,1800,200,300)
    //Nieve
    var Punton1 = PropFiguras(120,0,10)
    var Punton2 = PropFiguras(320,-801,15)
    var Punton3 = PropFiguras(403,-506,10)
    var Punton4 = PropFiguras(230,-492,15)
    var Punton5 = PropFiguras(687,-993,15)
    var Punton6 = PropFiguras(903,-932,10)
    var Punton7 = PropFiguras(560,-723,15)
    var Punton8 = PropFiguras(890,-630,10)
    var Punton9 = PropFiguras(1080,-240,15)


    override fun onDraw(c: Canvas) {

        super.onDraw(c)
        var p= Paint()

        puntero.setTitle("$width    $height")
        //fondo
        //c.drawARGB(100,89,224,241)
        c.drawARGB(100,115,249,253)
        //Sol
        p.color=Color.YELLOW
        sol.pintar(c,p)
        //nubes
        p.color=Color.rgb(170,170,173)
        nube1.pintar(c,p)
        nube2.pintar(c,p)
        nube3.pintar(c,p)
        nube4.pintar(c,p)
        //tirra
        p.color=Color.rgb(43,146,3)
        tierra.pintar(c,p)
        //troncos
        p.color=Color.rgb(143,36,4)
        tronco.pintar(c,p)

        //Arbol cabeza
        p.color=Color.rgb(150,230,24)
        arbolCopa.pintar(c,p)
        arbolCopa2.pintar(c,p)
        arbolCopa3.pintar(c,p)
        arbolCopa4.pintar(c,p)


        p.color = Color.RED
        TechoCasa.pintar(c,p)
        //BaseCasa
        p.color=Color.rgb(187,87,80)
        BaseCasa.pintar(c,p)
        p.color=Color.LTGRAY
        VentCasa.pintar(c,p)
        p.color=Color.BLACK
        puertCasa.pintar(c,p)

        p.color=Color.WHITE
        Punton1.pintar(c,p)
        Punton2.pintar(c,p)
        Punton3.pintar(c,p)
        Punton4.pintar(c,p)
        Punton5.pintar(c,p)
        Punton6.pintar(c,p)
        Punton7.pintar(c,p)
        Punton8.pintar(c,p)
        Punton9.pintar(c,p)





    }

    fun animarNieve() {
        Punton1.nevar(width,height)
        Punton2.nevar(width,height)
        Punton3.nevar(width,height)
        Punton4.nevar(width,height)
        Punton5.nevar(width,height)
        Punton6.nevar(width,height)
        Punton7.nevar(width,height)
        Punton8.nevar(width,height)
        Punton9.nevar(width,height)


        invalidate()
    }
}