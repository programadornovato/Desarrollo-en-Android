import javax.swing.JOptionPane

var texto=JOptionPane.showInputDialog("Humano mete el palindormo aqui")
if(texto!=null){
    texto=texto.toLowerCase()
    texto=texto.replace("\\s".toRegex(),"")
    val longitud=texto.length
    var igual=true
    var contador=0
    for (i in longitud-1 downTo 0){
        if(texto[i]!=texto[contador]){
            igual=false
            break
        }
        contador++
    }
    if(igual==true){
        JOptionPane.showMessageDialog(null,"Muy bien humano, el texto $texto es un palindromo")
    }else{
        JOptionPane.showMessageDialog(null,"Humano estupido el texto $texto no es un palindromo")
    }
}

