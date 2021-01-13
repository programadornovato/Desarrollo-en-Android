import javax.swing.JOptionPane

var numeroBuscar=JOptionPane.showInputDialog("Humano por favor ingresa el numero a buscar").toInt()
var listaNumeros=IntArray(7)
for (i in 0 until 7){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el numero en la posicion ${i+1}").toInt()
}
var pos=0
var bandera=false
while (pos<7 && bandera==false){
    if(numeroBuscar==listaNumeros[pos]){
        bandera=true
        break
    }
    pos++
}
if(bandera==true){
    println("Humano el numero $numeroBuscar se encuentra en la posicion ${pos+1}")
}else{
    println("Humano el numero $numeroBuscar no se encuentra en la lista")
}
