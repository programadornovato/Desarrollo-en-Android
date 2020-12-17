import javax.swing.JOptionPane

var aleatorio=(1..5).random()
var numero=JOptionPane.showInputDialog("Humano adivina que numero estoy pensando entre 1 y 5 \"Preciona Cancelar para terminar\" ")?.toInt()
while (numero!=aleatorio && numero!=null){
    numero=JOptionPane.showInputDialog("Humano estupido el numero que estaba pensando era $aleatorio intenta de nuevo ingresando un numero entre 1 y 5 \"Preciona Cancelar para terminar\" ")?.toInt()
    if(numero==null){
        break
    }
    aleatorio=(1..5).random()
}
if(numero==null){
    JOptionPane.showMessageDialog(null,"Humano, ademas de ser estupido eres impaciente, el numero que estaba pensando era $aleatorio")
}else{
    JOptionPane.showMessageDialog(null,"Felicidades")
}