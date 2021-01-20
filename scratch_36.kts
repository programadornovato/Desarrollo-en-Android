import javax.swing.JOptionPane
listaDinamica()
//listaEstatica()
fun listaEstatica(){
    var cantidadElementos=JOptionPane.showInputDialog("Humano cuantos elementos va a tener tu lista").toInt()
    var listaEstatica= arrayOfNulls<Int>(cantidadElementos)
    for (i in 0 until cantidadElementos){
        listaEstatica[i]=JOptionPane.showInputDialog("Humano ingres el elemento ${i+1}").toInt()
    }
    var listaEstaticaString=""
    listaEstatica.forEach {
        listaEstaticaString=listaEstaticaString+it+"\n"
    }
    JOptionPane.showMessageDialog(null,listaEstaticaString)
}
fun listaDinamica(){
    var listaDinamica=ArrayList<Int>()
    var respuesta:Char
    do{
        listaDinamica.add(JOptionPane.showInputDialog("Humano ingresa un elemento").toInt())
        respuesta=JOptionPane.showInputDialog("Humano si quieres seguir ingresando elementos s/n")[0]
    }while (respuesta=='s' || respuesta=='S')
    var listaDinamicaString=""
    listaDinamica.forEach{
        listaDinamicaString=listaDinamicaString+it+"\n"
    }
    JOptionPane.showMessageDialog(null,listaDinamicaString)
}