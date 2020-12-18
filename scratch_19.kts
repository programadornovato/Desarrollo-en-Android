var arregloNumeros= arrayOf(5,6,7,8,65,4,8,5,10,45)
println("El elemento 3=${arregloNumeros[3]}")
println("Indices=${arregloNumeros.indices}")

for (i in arregloNumeros.indices){
    println("El elemento $i=${arregloNumeros[i]}")
}
