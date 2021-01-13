import javax.swing.JOptionPane

var numerosTexto=JOptionPane.showInputDialog("Humano ingresa una lista de nuemros separados por coma")
var listaNumerosTexto=numerosTexto.split(",".toRegex()).toTypedArray()
var cantidad=listaNumerosTexto.size
var listaNumeros=IntArray(cantidad)
for (i in (0 until cantidad)){
    listaNumeros[i]=listaNumerosTexto[i].toInt()
}
var tem=0
var contador=0
var bandera=true
for (i in 0 until cantidad-1){
    if(bandera==false){
        break
    }
    bandera=false
    for (j in 0 until cantidad-1){
        if(listaNumeros[j]>listaNumeros[j+1]){
            bandera=true
            tem=listaNumeros[j]
            listaNumeros[j]=listaNumeros[j+1]
            listaNumeros[j+1]=tem
        }
    }
    contador++
}
println("Esto se repitio $contador")
println("Humano aqui estan tus pinches numero ordenados ascendente")
for (i in 0 until cantidad){
    println(listaNumeros[i])
}
println("Humano aqui estan tus pinches numero ordenados decendente")
for (i in (cantidad-1) downTo 0){
    println(listaNumeros[i])
}