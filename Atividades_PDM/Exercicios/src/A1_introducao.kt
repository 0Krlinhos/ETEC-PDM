// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Carlos Eduardo")
    print(" ")
    print("Reis")

    println()

    var nome = "3. Carlos Eduardo\nOliveira\nReis"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Edson" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Reis"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Oliveira " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}