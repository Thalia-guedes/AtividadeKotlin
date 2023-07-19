package Exercicio02

import java.lang.NumberFormatException

class Sacolao {
    companion object {
        val legumes = mutableListOf<Int>()
        val verduras = mutableListOf<Double>()
        val graos = mutableListOf<Double>()
        val outros = mutableListOf<Int>()
    }

    fun verduras() {
        while (true) {
            try {
                println("Digite a quantidade em gramas que deseja: ")
                val verdura = readln()

                if (verdura.isNullOrBlank()) {
                    throw UnsupportedOperationException("As gramas nao podem ser vazias!")
                }

                val verduraAdicionada = verdura.toDouble()
                verduras.add(verduraAdicionada)
                println("Você pesou -> $verduraAdicionada gramas")
                break
            } catch (e: NumberFormatException) {
                println("Para verduras, a quantidade deve ser informada com ponto.")
            }
        }
    }

    fun graos() {
        while (true) {
            try {
                println("Digite a quantidade em gramas que deseja: ")
                val grao = readln()

                if (grao.isNullOrBlank()) {
                    throw UnsupportedOperationException("As gramas nao podem ser vazias!")
                }
                val graosAdicionados = grao.toDouble()
                graos.add(graosAdicionados)

                println("Voce pesou -> $graosAdicionados gramas")
                break
            } catch (e: NumberFormatException) {
                println("Para grãos, a quantidade deve ser informada com ponto.")
            }
        }
    }

    fun legumes() {
        while (true) {
            try {
                println("Digite a quantidades de legumes que deseja: ")
                val legumeQnt = readln()
                if (legumeQnt.isNullOrBlank()) {
                    throw UnsupportedOperationException("A quantidade nao pode ser vazia: ")

                }
                val legume = legumeQnt.toInt()
                legumes.add(legume)
                println("Legumes adicionados a sacola, quantidade -> $legume")
                break
            } catch (e: NumberFormatException) {
                println("Para legumes a quantidade informada deve ser em unidades inteiras")
            }
        }

    }

    fun outros() {
        while (true) {
            try {
                println("Digite o nome do produto: ")
                val produto = readln()

                if (produto.isNullOrBlank()) {
                    throw UnsupportedOperationException("O nome do produto não pode ser vazio.")
                }

                println("Digite a quantidade que deseja (unidades inteiras): ")
                val quantidadeStr = readln()

                if (quantidadeStr.isNullOrBlank()) {
                    throw UnsupportedOperationException("O nome do produto não pode ser vazio.")
                    continue
                }
                val outro = quantidadeStr.toInt()

                outros.add(outro)

                println("Produto '$produto' adicionado com quantidade '$outro'")
                break
            } catch (e: NumberFormatException) {
                println("A quantidade informada deve ser um número inteiro!")
            }
        }
    }
}