import javax.swing.JOptionPane

var calificaciones=DoubleArray(4)
var contador=0
var suma=0.0
var promedio=0.0

do{
    var calificacion=JOptionPane.showInputDialog("Humano ingresa la calificacion del alumno en el semestre ${contador+1}")?.toDouble()
    if(calificacion==null){
        break
    }else{
        calificaciones[contador]=calificacion
    }
    contador++
}while (contador<4)
if(contador>0){
    calificaciones.forEach {
        suma+=it
    }
    promedio=suma/contador
    JOptionPane.showMessageDialog(null,"El promedio del alumno es $promedio")
}else{
    JOptionPane.showMessageDialog(null,"Humano flojo por lo menos deberias de ingresar una calificacion")
}