import javax.swing.JOptionPane

val altura=JOptionPane.showInputDialog("humano por favor ingresa el tamaño de tu pinche escalera").toInt()

for (numAsteriscos in (1..altura)){
    
    for (i in (1..numAsteriscos)){
        print("*")
    }
    println("")
}

