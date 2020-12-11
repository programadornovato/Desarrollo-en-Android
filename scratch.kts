println("Hola humano, por favor ingresa una opcion del 1 al 9:")
println("1.- Para acceder")
println("2.- Ir a configuraciones")
println("3.- Ir a ayuda")
println("4,5,6,7,8,9.- Para salir")
var opcion= readLine()!!.toInt()
when(opcion){
    1-> {
        println("Precionaste acceder")
        println("Ingresa tu usuario")
        println("Ingresa tu contraseña")
    }

    2-> println("Area de configuraciones")
    3-> println("Area de ayuda")
    in(4..9)-> println("Adios humano te voy a extrañar")
    else-> println("Humano estupido te pedi un numero del 1 al 9 y me das una $opcion")
}

