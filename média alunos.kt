fun main(){

    var soma = 0.0

    for(i in 1..6){
        println("Digite a nota: ")
        var nota = readln().toDouble()

        while(nota < 0 || nota > 10){
            print("Digite um número válido: ")
            nota = readln().toDouble()
        }
         soma += nota
    }
    var media = (soma)/2
    println("A média das notas será: " + media)
}