package mx.edu.itt.ladm_u2_practic1_danielmora

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path

class PropFiguras (){
    var x = 0f
    var y = 0f
    var tx1 = 0f
    var tx2 = 0f
    var tx3 = 0f
    var ty1 = 0f
    var ty2 = 0f
    var ty3 = 0f
    var tipo = 1 //1 circulo 2 rectangulo 3 triangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 5
    var incY = 5

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }

    constructor(x:Int, y:Int, ancho:Int, alto:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.ancho = ancho.toFloat()
        this.alto = alto.toFloat()
        tipo = 2
    }
    constructor(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int) : this() {
        this.tx1 = x1.toFloat()
        this.ty1 = y1.toFloat()
        this.tx2 = x2.toFloat()
        this.ty2 = y2.toFloat()
        this.tx3 = x3.toFloat()
        this.ty3 = y3.toFloat()
        tipo = 3
    }

    fun pintar(c: Canvas, p: Paint){
        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
            3 -> {
                val path = Path()
                path.moveTo(tx1, ty1)
                path.lineTo(tx2, ty2)
                path.lineTo(tx3, ty3)
                path.close()
                c.drawPath(path, p)
            }
        }
    }

    fun nevar(ancho:Int, alto:Int){

        y+= incY
        if(y>=alto){
            y=0f
        }

    }
}