import java.lang.Exception
import kotlin.math.PI
try {
    println("Humano dime cuantos litros de cerveza requieres para estar en estado inconveniente:")
    var litrosParaEstarBorracho= readLine()!!.toDouble()
    var miliLitrosParaEstarBorracho=litrosParaEstarBorracho*1000
    println("Que diametro tiene el vaso:")
    var diametro= readLine()!!.toDouble()
    println("Que altura tiene el vaso:")
    var altura= readLine()!!.toDouble()
    var radio=diametro/2
    var volumen= PI*radio*2*altura
    var vasosParaEstarBorracho=miliLitrosParaEstarBorracho/volumen
    println("Humano cuanto vasos de cerveza has tomado:")
    var vasosTomados= readLine()!!.toDouble()

    if(vasosTomados>vasosParaEstarBorracho){
        println("Humano ya estas en estado inconveniente")
    }
    else{
        println("Humano te faltan ${vasosParaEstarBorracho-vasosTomados} vasos para estar borracho")
    }
}
catch (e:Exception){
    println("Humano parece que ya estas borracho porque no estas escribiendo bien "+e)
}