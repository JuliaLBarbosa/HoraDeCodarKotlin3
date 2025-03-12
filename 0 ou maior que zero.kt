
fun main() {

    println("Digite o primeiro número: ")
    var n1 = readln().toInt()

    var n2: Int
    do{ println("Digite o segundo número maior que 0")
       n2 = readln().toInt()
    }while (n2 <= 0)

    println("A divisão dos números será: " + (n1 / n2))
}