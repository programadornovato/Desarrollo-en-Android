import kotlin.math.ceil

println("Hola humano bienvenido a tu tienda pn")
println("Ingresa el precio del producto 1")
val precio1= readLine()!!.toDouble()
println("Ingresa el precio del producto 2")
val precio2= readLine()!!.toDouble()
println("Ingresa el precio del producto 3")
val precio3= readLine()!!.toDouble()
val total=precio1+precio2+precio3
val totalMasRedondeo= ceil(total)
val redondeo=totalMasRedondeo-total
if(redondeo>0.0){
    println("¿El cliente decea redondear sus %.2f".format(redondeo))
    println("S/N")
    val respuesta= readLine()
    if(respuesta=="S" || respuesta=="s"){
        println("Total a pagar %.2f".format(totalMasRedondeo))
        println("Gracias por redondear %.2f".format(redondeo))
    }else{
        println("Total a pagar %.2f".format(total))
        println("Gracias pinche miserable")
    }
}


