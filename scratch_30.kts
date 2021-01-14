var alumnos=Array(7){
    Array<String?>(2){null}
}
for (i in 0 until 7){
    println("Humano ingresa el nombre del alumno ${i+1}")
    alumnos[i][0]= readLine()
    println("Humano ingresa el salon del alumno ${i+1}")
    alumnos[i][1]= readLine()
}
println("Humano por favor ingresa el salon de los alumnos que quieres ver:")
var salon= readLine()

for (i in 0 until 7){
    if(alumnos[i][1]==salon){
        print("${alumnos[i][0]} ${alumnos[i][1]} ")
    }
    println()
}


