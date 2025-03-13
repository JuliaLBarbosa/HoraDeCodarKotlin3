fun main(){

    var soma = 0
    var divisao = 0
    var contador = 15

    while (contador >= 15 && contador <= 100){
        soma = soma + contador
        contador = contador + 1
        divisao = divisao +1
    }
    println("A média aritmética dos números entre 15 e 100 somados será: " + (soma / divisao))
}