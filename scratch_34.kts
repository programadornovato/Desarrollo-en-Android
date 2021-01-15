var matriz=Array(5){IntArray(5)}
var dato=1
for (i in 0 until matriz.size){
    for (j in 0 until matriz[0].size) {
        matriz[i][j]=dato
        dato++
    }
}
for (i in 0 until matriz.size){
    for (j in 0 until matriz[0].size) {
        print("${matriz[i][j]}\t")
    }
    println()
}
var diagonaPrincipal=IntArray(matriz.size)
var diagonaSecundaria=IntArray(matriz[0].size)
for (i in 0 until matriz.size){
    for (j in 0 until matriz[0].size){
        if(i==j){
            diagonaPrincipal[i]=matriz[i][j]
        }
        if((i+j)==matriz.size-1){
            diagonaSecundaria[i]=matriz[i][j]
        }
    }
}
var suma=0
println("Diagonal principal")
diagonaPrincipal.forEach {
    print("$it\t")
    suma= suma+it
}
println("La suma de la diagonal principal es:$suma")
suma=0
println("Diagonal secundaria")
diagonaSecundaria.forEach {
    print("$it\t")
    suma= suma+it
}
println("La suma de la diagonal secundaria es:$suma")



