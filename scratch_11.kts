val d1=(1..6).random()
val d2=(1..6).random()
val d3=(1..6).random()
println("Dado 1=$d1")
println("Dado 2=$d2")
println("Dado 3=$d3")

if(d1==6 && d2==6 && d3==6){
    println("Excelente")
}else{
    if( (d1==6 && d2==6) || (d1==6 && d3==6)  || (d2==6 && d3==6) ){
        println("Muy bien")
    }else{
        if( d1==6 || d2==6 || d3==6 ){
            println("Regular")
        }else{
            if( d1!=6 && d2!=6 && d3!=6 ){
                println("Pesimo")
            }
        }
    }
}




