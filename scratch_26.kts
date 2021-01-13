import javax.swing.JOptionPane

var listaNumeros=IntArray(5)
for (i in 0 until 5){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el elemento ${i+1}").toInt()
}
var menor=0
var pos=0
var tem=0
for(i in 0 until 4){
    menor=listaNumeros[i]
    pos=i
    for (j in i+1 until 5){
        if(listaNumeros[j]<menor){
            menor=listaNumeros[j]
            pos=j
        }
    }
    if(pos!=i){
        tem=listaNumeros[i]
        listaNumeros[i]=listaNumeros[pos]
        listaNumeros[pos]=tem
    }
}
println("Huamno aqui esta tu pinche lista ordenada de forma acendente")
for (i in 0 until 5){
    println(listaNumeros[i])
}
println("Huamno aqui esta tu pinche lista ordenada de forma decendente")
for (i in 4 downTo 0){
    println(listaNumeros[i])
}




