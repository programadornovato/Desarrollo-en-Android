import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

println("Humano cual es tu fecha de nacimiento en formato (dd/MM/yyyy):")
val fechaNacimientoString= readLine()
lateinit var fechaNacimientoDate:Date
try {
    fechaNacimientoDate=SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoString)
}
catch (e:Exception){
    println("Humano estupido esa no es una fecha de nacimiento correcta $e")
}
val fechaActual=Date(System.currentTimeMillis())
val diferenciaFechaMilisegundos=fechaActual.getTime()-fechaNacimientoDate.getTime()
val segundos=diferenciaFechaMilisegundos/1000
//println(segundos)
val minutos=segundos/60
val horas=minutos/60
val dias=horas/24
val años=dias/365
println("Humano tu tienes $años")
