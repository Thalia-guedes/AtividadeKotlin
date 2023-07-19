package Exercicio02


fun main() {
    val sac = Sacolao()
    do {
        println("Bem vindo ao Sacolao Center")
        println("Escolha uma opção: ")
        println("1- Verduras")
        println("2- Grãos")
        println("3- Legumes")
        println("4- Outros")
        println("5- Sair")
        var opcao = readln().toIntOrNull()

        when(opcao){
            1 -> sac.verduras()
            2 -> sac.graos()
            3 -> sac.legumes()
            4 -> sac.outros()
            5 -> "sair"
        }

    }while (opcao != 5)
}