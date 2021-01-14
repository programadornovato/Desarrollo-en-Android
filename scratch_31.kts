import javax.swing.JOptionPane

var matrizO=Array(3){IntArray(3)}
var matrizT=Array(3){IntArray(3)}

for (i in 0 until 3){
    for (j in 0 until 3){
        matrizO[i][j]=JOptionPane.showInputDialog("Humano por favor ingresa el valor de la matriz[${i+1}][${j+1}]").toInt()
    }
}
for (i in 0 until 3){
    for (j in 0 until 3) {
        matrizT[i][j]=matrizO[j][i]
    }
}
var stringMatriz=""
for (i in 0 until 3){
    for (j in 0 until 3) {
        stringMatriz="$stringMatriz ${matrizT[i][j]} | "
    }
    stringMatriz="$stringMatriz\n"
}
JOptionPane.showMessageDialog(null,stringMatriz)


