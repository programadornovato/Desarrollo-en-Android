import javax.swing.JOptionPane

var texto:String=JOptionPane.showInputDialog("Humano ingresa un texto para que te lo voltie")
if(texto!=null){

    val longitud=texto.length
    var caracteres=CharArray(longitud)
    var contador=0
    for(i in (longitud-1 downTo 0)){
        caracteres[contador]=texto[i]
        contador++
    }
    //JOptionPane.showMessageDialog(null,caracteres)
    println(caracteres)
}else{
    JOptionPane.showMessageDialog(null,"Humano flojo debes de colocar un texto")
}
