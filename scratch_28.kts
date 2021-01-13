import javax.swing.JOptionPane

var numeroBuscar=JOptionPane.showInputDialog("Humano por favor ingresa el numero a buscar").toInt()
var listaNumeros=IntArray(7)
for (i in 0 until 7){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el numero en la posicion ${i+1}").toInt()
}

var n=listaNumeros.size
var inf=0
var centro=0
var sup=n-1
var bandera=false
while (inf<=sup){
    centro=(inf+sup)/2
    if(numeroBuscar==listaNumeros[centro]){
        bandera=true
        break
    }
    else if(numeroBuscar<listaNumeros[centro]){
        sup=centro-1
    }
    else{
        inf=centro+1
    }
}
if(bandera==true){
    println("Muy bien humano el numero $numeroBuscar esta en la posicion ${centro+1}")
}else{
    println("Humano estupido el numero $numeroBuscar no esta en la lista de numeros")
}


