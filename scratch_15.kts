var perros= arrayOf("Monte","Chupacabras","Solovino","Chimuelo","Chiquito")
for (i in perros.indices){
    println("El perro ${i+1} es ${perros[i]}")
}
var indice=0
perros.forEach {
    println("El perro ${indice+1} es $it")
    indice++
}

