package Atividades_PDM.src// Aula6

fun main(){
    val str = "Programação Kotlin";
    var msg:String;

    msg = "Tamanho da String: ${str.length} caracteres";
    //propriedade length (comprimento, tamanho)

    msg = "Posição (Indíce) 0 da string: ${str[9]}"
    //Propriedade contúdo no índice 0

    msg = str.startsWith("Pro").toString()
    //método booleano de string: começa com?


    msg = str.endsWith("abc").toString()
    //método booleano de string: termina com?

    msg = str.substring(2,4)
    //retira um trecho (do tamanho definido nos parâmetros)
    //Método de string que recupera do índice até antes do 4

    msg = str.replace("Kotlin", "com Kotlin.")

    msg = str.lowercase()
    // convert pra minuscula

    msg = str.uppercase()
    //tudo maiuscula


    println(msg);
}