package Exercicio03


fun main() {
    val converter = ConversorMoedas()

    do {
        println("BEM VINDO AO CONVERSOR DE MOEDAS")
        println("DIGITE A OPÇAO DESEJADA PARA CONVERTER")
        println("1- Dólar Americano\t\n2- Dólar Canadense\t\n3- Euro\t\n4- Libra Esterlina")
        val opcao = readln().toIntOrNull()

        when(opcao){
            1 -> converter.dolarAmericano()
            2 -> converter.dolarCananadense()
            3 -> converter.euro()
            4 -> converter.libraEsterlina()
            5 -> "Sair..."

        }

    }while (opcao!= 5)
}