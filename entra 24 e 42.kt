fun main(){

    var numeroDentro = 0
    var numeroFora = 0

    for (i in 1..10){
        println("Digite um número: ")
        var n = readln().toInt()

     if(n >= 24 && n <= 42){
         numeroDentro++
     }else {
         numeroFora++
     }
    }
    println("Quantidade de números que estão entre 24 e 42: " + numeroDentro)
    println("Quantidade de números que estão fora: " + numeroFora)

}