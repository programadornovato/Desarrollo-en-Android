class auto(){
    var color=""
    var modelo=0
    var marca=""
    fun enciende(){
        println("El auto esncendio")
    }
    fun acelera(){
        println("El auto acelereo 10Km/h mas")
    }
    fun frena(){
        println("El auto desacelero 10Km/h menos")
    }
}
var vocho1=auto()
vocho1.color="Verde"
vocho1.modelo=1980
vocho1.marca="Vocho"
println(vocho1.color)
println(vocho1.modelo)
println(vocho1.marca)
vocho1.enciende()
vocho1.acelera()
vocho1.frena()

var vocho2=auto()
vocho2.color="Azul"
vocho2.modelo=1985
vocho2.marca="Vocho"
println(vocho2.color)
println(vocho2.modelo)
println(vocho2.marca)
