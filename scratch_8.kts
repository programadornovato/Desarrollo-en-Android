/*
println("Hola humano, por favor inres alguno de los textos de este menu \nacceso\nconfiguracion\nayuda")
val seleccion= readLine()!!.toLowerCase()
when(seleccion){
    "acceso"-> println("Seleccionaste acceso")
    "configuracion"-> println("Seleccionaste configuracion")
    "ayuda"-> println("Seleccionaste ayuda")
    else -> println("Humano tonto no seleccionaste nuguna de las opciones")
}

println("Humano por favor saludame con un hola")
val saludo= readLine()
if(saludo=="hola"){
    println("Hola humano como estas")
}else{
    println("No entendi")
}
*/
println("Humano por favor saludame con un hola")
val saludo= readLine()
if(saludo.equals("hola")==true){
    println("Hola humano como estas")
}else{
    println("No entendi")
}

