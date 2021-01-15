import javax.swing.JOptionPane

var fil=JOptionPane.showInputDialog("Humano ingresa la cantidad de filas de tu matriz").toInt()
var col=JOptionPane.showInputDialog("Humano ingresa la cantidad de columnas de tu matriz").toInt()
var matriz=Array(fil){IntArray(col)}
for (i in 0 until fil){
    for (j in 0 until col){
        matriz[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]").toInt()
    }
}
var sumaFil=0
for (i in 0 until fil){
    sumaFil=0
    for (j in 0 until col){
        sumaFil=sumaFil+matriz[i][j]
    }
    println("La suma de la fila ${i+1}=$sumaFil")
}
var sumaCol=0
for (j in 0 until col){
    sumaCol=0
    for (i in 0 until fil){
        sumaCol=sumaCol+matriz[i][j]
    }
    println("La suma de la columna ${j+1}=$sumaCol")
}


