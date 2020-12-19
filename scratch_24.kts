import javax.swing.JOptionPane

var mayor=0
var numerosTexto=JOptionPane.showInputDialog("Humano ingresa una lista de nuemros separados por coma")
var listaNumerosTexto=numerosTexto.split(",".toRegex()).toTypedArray()
var cantidad=listaNumerosTexto.size
var listaNumeros=IntArray(cantidad)
for (i in (0 until cantidad)){
    listaNumeros[i]=listaNumerosTexto[i].toInt()
}
listaNumeros.forEach {
    if(it>mayor){
        mayor=it
    }
}
JOptionPane.showMessageDialog(null,"Humano este es el numero mayor $mayor")





/*
listaNumerosTexto.forEach {
    println(it)
}
*/