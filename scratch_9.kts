import kotlin.math.round

println("¡¡Humano por favor, ingresa un NUMERO entre 0 y 10")
var calificacion= readLine()!!.toDouble()
var calificacionRedondeada= round(calificacion)
if( (calificacionRedondeada>=0) and (calificacionRedondeada<6) ){
    println("Ya se chingo")
}
else if( (calificacionRedondeada>=6) and (calificacionRedondeada<=9) ){
    println("Ya chingo")
}
else if( calificacionRedondeada==10.0 ){
    println("Este alumno es una v3rg4")
}
else{
    println("¡¡Humano estupido!! te pedi un numero entre 0 y 10")
}
