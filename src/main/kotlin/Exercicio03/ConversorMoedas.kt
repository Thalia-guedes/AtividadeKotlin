package Exercicio03

import java.lang.NumberFormatException


class ConversorMoedas {

    fun dolarAmericano(){

        println("Digite o valor em reais para converter em Dólar: ")
        val valorReal = readln()?.toDoubleOrNull()

        if (valorReal == null || valorReal <= 0){
            throw NumberFormatException("Valor invalido")
        }

        val taxcambio : Float = 0.1847950622759F
        val testar = valorReal?.times(taxcambio)
        println("Valor convertido é: R$$testar")
    }
    fun dolarCananadense(){

        println("Digite o valor em reais para converter: ")
        val valorReal = readln()?.toDoubleOrNull()

        if (valorReal == null || valorReal <=0){
            throw NumberFormatException("Valor invalido!")
        }

        val taxaCambio = 0.20
        val valorConvertido = valorReal * taxaCambio
        println("Valor convertido : R$$valorConvertido")
    }
    fun euro(){
        println("Digite o valor em reais para converter: ")
        val valorReal = readln()?.toDoubleOrNull()

        if (valorReal == null || valorReal <=0){
            throw NumberFormatException("Valor invalido!")
        }

        val taxaCambio = 0.13
        val valorConvertido = valorReal * taxaCambio
        println("O valor convertido é R$$valorConvertido")

    }
    fun libraEsterlina(){

        println("Digite o valor em reais para converter: ")
        val valorReal = readln()?.toDoubleOrNull()

        if (valorReal == null || valorReal <=0){
            throw NumberFormatException("Valor invalido!")
        }
        val taxaCambio = 0.17

        val valorConvertido = valorReal * taxaCambio
        println("O valor convertido é R$$valorConvertido")
    }
}