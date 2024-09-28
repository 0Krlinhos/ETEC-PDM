/*
    Aula 8: Exercício de reforço
    Métodos e funções
 */

/* 1. Escreva uma função que seja capaz de receber a quantidade de anos e tranformar em meses, dias, hras, minutos e segundos. Sída desejada:
    2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos
 */

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de carcteres

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */

// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.

fun main() {

    println(converterAnos(2)) // Chamada da função 1

    println(contarCaracteres("Palavra")) // Chamada da função 2

    println(calcularCubo(3)) // Chamada da função 3

    println(converterMilhasParaKm(5.0)) // Chamada da função 4

    trocarLetrasEImprimir("Programação em Kotlin Amém") // Chamada da função 5
}

// 1. Função para converter anos em meses, dias, horas, minutos e segundos
fun converterAnos(anos: Int): String {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    return """
        $anos anos equivalem a:
        $meses meses
        $dias dias
        $horas horas
        $minutos minutos
        $segundos segundos
        """.trimIndent()
}

// 2. Função para contar a quantidade de caracteres em uma string
fun contarCaracteres(str: String): Int = str.length

// 3. Função para calcular o cubo de um número inteiro
fun calcularCubo(n: Int): Int = n * n * n

// 4. Função para converter milhas em quilômetros
fun converterMilhasParaKm(milhas: Double): Double = milhas * 1.6

// 5. Função para trocar letras "a" ou "A" por "x" e imprimir o resultado em maiúsculas
fun trocarLetrasEImprimir(str: String) {
    val resultado = str.replace(Regex("[aA]"), "x").toUpperCase()
    println(resultado)
}

