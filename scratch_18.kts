import javax.swing.JOptionPane

var contador=0
var suma=0.0
var promedio=0.0
do{
    var calificacion=JOptionPane.showInputDialog("Humano por favor ingresa la calificacion del semestre ${contador+1} o precione cancelar para terminar")?.toDouble()
    if(calificacion!=null){
        suma+=calificacion
        contador++
    }
}while (calificacion!=null)
if(contador>0){
    promedio=suma/contador
    JOptionPane.showMessageDialog(null,"El promedio es de: $promedio")
}else{
    JOptionPane.showMessageDialog(null,"Humano estupido y flojo, por lo menos debes de poner una calificacion")
}


/*
var calificacion=JOptionPane.showInputDialog("Humano por favor ingresa la calificacion del semestre ${contador+1} o precione cancelar para terminar").toDouble()
while (calificacion!=null){
    if(calificacion!=null){
        suma+=calificacion
        contador++
    }
    var calificacion=JOptionPane.showInputDialog("Humano por favor ingresa la calificacion del semestre ${contador+1} o precione cancelar para terminar").toDouble()
}
*/
