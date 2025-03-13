fun main(){

    println("Informe até qual número deseja saber a tabuada: ")
    val numero = readln().toInt()

    for (i in 1..numero) {
        for (contador in 1..10) {


            val resultado = i * contador
            println("$i x $contador = $resultado")
        }
        println()
    }
}