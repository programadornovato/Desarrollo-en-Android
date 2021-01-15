import javax.swing.JOptionPane

var fil=JOptionPane.showInputDialog("Humano ingresa la cantidad de filas de tu matriz").toInt()
var col=JOptionPane.showInputDialog("Humano ingresa la cantidad de columnas de tu matriz").toInt()
var matriz=Array(fil){IntArray(col)}
var esSimetrica=true
for (i in 0 until fil){
    for (j in 0 until col){
        matriz[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]").toInt()
    }
}
if(col==fil){
    for (i in 0 until fil){
        for (j in 0 until col){
            if(matriz[i][j]!=matriz[j][i]){
                esSimetrica=false
                break
            }
        }
        if(esSimetrica==false){
            break
        }
    }
    if(esSimetrica==true){
        JOptionPane.showMessageDialog(null,"Felicidades humano tu matriz es simetrica")
    }else{
        JOptionPane.showMessageDialog(null,"Humano estupido te pedi una matriz simetrica y esta no lo es")
    }
}else{
    JOptionPane.showMessageDialog(null,"Ni para eso eres bueno, las filas y las columnas de una matriz simetrica deben de ser iguales")
}






