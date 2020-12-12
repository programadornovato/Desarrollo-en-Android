println("Hola humano bienvenido al banco pn")
println("Por favor ingresa una de las siguientes opciones:")
println("1.- Ver saldo")
println("2.- Inresar dinero")
println("3.- Retiro de dinero")
println("4.- Salir")
try {
    val opcion= readLine()!!.toInt()
    var saldo=100.0
    when(opcion){
        1->println("Humano tu saldo es $saldo")
        2->{
            println("Cuando dinero vas a ingresar:")
            val dineroIngresar= readLine()!!.toDouble()
            saldo=saldo+dineroIngresar
            println("Humano, tu saldo es de $saldo")
        }
        3->{
            println("Cuanto dinero desea retirar:")
            val dineraRetirar= readLine()!!.toDouble()
            if( saldo-dineraRetirar<0 ){
                println("Humano pillin no tienes tanto saldo")
                println("Tu saldo es de $saldo")
            }else{
                saldo=saldo-dineraRetirar
                println("Humano, tu saldo es de $saldo")
            }
        }
        4-> println("Gracias por usar el pn ")
        else-> println("Humano tonto, esa opcion no es valida")
    }
}
catch (e:Exception){
    println("Error $e")
}
