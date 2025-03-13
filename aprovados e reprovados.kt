fun main(){

    var resposta = "s"
    var alunoAprovado = 0
    var alunoReprovado = 0

    while(resposta == "s"){
        println("Digite a primeiro nota: ")
        var nota1 = readln().toDouble()
        println("Digite a segunda nota: ")
        var nota2 = readln().toDouble()

        var media = (nota1 + nota2)/2

        if(media >= 9.5){
            println("Aluno aprovado")
            alunoAprovado++
        }else{
            println("Aluno reprovado")
            alunoReprovado++
        }

        println("Você deseja calcumar a nota de outro aluno Sim/Não? ")
        resposta = readln()
    }
    println("Quantidade de alunos aprovados " + alunoAprovado)
    println("Quantidade de alunos reprovados: " + alunoReprovado)
}