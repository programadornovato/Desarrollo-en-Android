import javax.swing.JOptionPane

/*
for (i in (0 .. 9)){
    println("i=$i")
}
for (i in (0 until 10)){
    println("i=$i")
}
for (i in (0 ..9)step 3){
    println("i=$i")
}

for (i in (9 downTo 0) step 3){
    println("i=$i")
}
*/
val repeticiones=JOptionPane.showInputDialog("Humano ingresa la cantidad de repeciones").toInt()
for (i in (0 until repeticiones)) println("i=${i+1}")

