import javax.swing.JOptionPane

/*
var i=1
while(i<=10){
    println("i=$i")
    i++
}
var i=10
while (i>=1){
    println("i=$i")
    i--
}
*/
val repeticiones=JOptionPane.showInputDialog("Humano ingresa la cantidad de veces que quieras que se repita el ciclo").toInt()
var i=1
while (i<=repeticiones){
    println("i=$i")
    i++
}
