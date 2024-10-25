import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

//seguinda a regra essa pode acabar sendo 3 a mais na real, pois tem a 18-1 e 18-2

fun main(){
    var str:String? = null
    //print(str!!.length)
    try {
        println(str[str.length - 1])
        val n = 10/0
        println(str!!.length)
    }catch (e: NullPointerException){
        println("A variavel é nula!")
    }

    } catch (e: ArithmeticException){
        println("Impossível dividir por zero!")
    } finally {
        println("Fechando conexão com BD")
    }

    println("fim")

    try{
        10/0
        return
    }catch(e: Exception){
        println("Exception")
    } finally {
        println("finally")
    }
}