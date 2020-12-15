import javax.swing.JOptionPane

val numero=JOptionPane.showInputDialog("Humano por favor ingresa un numero entre 1 y 999").toInt()
if(numero<1 || numero>=1000){
    JOptionPane.showMessageDialog(null,"Humano tonto el numero $numero no esta en el rango de 1 y 999")
}else{
    if(numero>=1 && numero<=9){
        JOptionPane.showMessageDialog(null,"El numero $numero le pertenece a las unidades")
    }else{
        if(numero>=10 && numero<=99){
            JOptionPane.showMessageDialog(null,"El numero $numero le pertenece a las decenas")
        }else{
            if(numero>=100 && numero<=999){
                JOptionPane.showMessageDialog(null,"El numero $numero le pertenece a las centenes")
            }
        }
    }
}