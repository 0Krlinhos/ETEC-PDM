// "Aula 20": operador Elvis ?:
fun main(){
    var str :String? = null
    if (str == null) {
        println("a variável é nula")
    } else{
        println(str)
    }

    println(str ?: "Ok. Segundo Elvis, a variável 'str' é nula")
    println(str ?: 7)
    var teste = str ?: true
    println(teste)
    println(str ?: nulidade())
}

fun nulidade(): String{
    return "Sim! É nula"
}