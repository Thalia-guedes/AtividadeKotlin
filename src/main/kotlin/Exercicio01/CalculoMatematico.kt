package Exercicio01

class CalculoMatematico {

    fun divisao (num1 : Int, num2: Int): Int {
        return try {
            num1 / num2
        }catch (e: ArithmeticException){
            println("Operaçao nao pode ser realizada")
            return 0
        }

    }
}