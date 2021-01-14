import javax.swing.JOptionPane
/*
var matriz= arrayOf(
        intArrayOf(5,6,7),
        intArrayOf(1,2,3),
        intArrayOf(4,5,6)
)
for (i in 0 until 3){
    for (j in 0 until 3){
        print("${matriz[i][j]},")
    }
    println()
}
*/
var reg=JOptionPane.showInputDialog("Humano que cantidad de registros quieres:").toInt()
var col=JOptionPane.showInputDialog("Humano que cantidad de columnas quieres:").toInt()

var matrizDinamica=Array(reg){IntArray(col)}
for (i in 0 until reg){
    for (j in 0 until col){
        matrizDinamica[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]").toInt()
    }
}
println("Aqui esta tu pinche matriz")
for (i in 0 until reg){
    for (j in 0 until col){
        print("${matrizDinamica[i][j]},")
    }
    println()
}

