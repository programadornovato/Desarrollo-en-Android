import javax.swing.JOptionPane

var a:IntArray=IntArray(5)
var b:IntArray=IntArray(5)
var c:IntArray=IntArray(10)
var j=0
for (i in (0 .. 4)){
    a[i]=JOptionPane.showInputDialog("Humano ingresa el elemento ${i+1} del arreglo a").toInt()
}
for (i in (0 .. 4)){
    b[i]=JOptionPane.showInputDialog("Humano ingresa el elemento ${i+1} del arreglo b").toInt()
}
for (i in (0 .. 4)){
    c[j]=a[i]
    j++
    c[j]=b[i]
    j++
}
c.forEach {
    println(it)
}
