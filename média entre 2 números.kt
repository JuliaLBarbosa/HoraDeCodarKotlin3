fun main(){

    var soma =  0
    var media = 0

    println("Digite um número(menor): ")
    var n1 = readln().toInt()

    println("Digite um número(maior): ")
    var n2 = readln().toInt()

    while(n1 <= n2){
        soma = soma + n1
        media = media + 1
        n1 = n1 + 1
    }
    var resultado = soma / media
    println("A média aritmética dos dois números inteiros informados pelo usuário " +
            "e todos os números inteiros entre eles será: " + resultado)
}