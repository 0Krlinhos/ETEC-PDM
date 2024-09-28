//Aula 4: Exercícios de reforço
//Variáveis, tipo de dados e operadores aritméticos


// a. Crie um novo arquivo chamado A04_Exercicio.kt com uma função main.


// b. Declare uma variãvel mutável capaz de armazenar seu nome completo.


// c. Declare uma variável de texto sem valor algum.


// d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça


// e. Declare uma variável capaz de armazenar o PIB do Brasil este em 2024 (cerca de R$ 10.900.000.000.000,00)


// f. Declare uma variável capaz de armazenar a população do Brasil (cerca de 212,600.000)


// g. Imprima no terminal o valor do PIB per capita (PIB / população).


// h. Rode seu programa de forma que não possua erros de compilação ou execução.


fun Main()
{
    var nome = "Carlos Eduardo Oliveira Reis";

    var text: String;

    val numero:Byte = 41;

    var PIB_2024: Float = 10900000000000.00f;
    var populacao = 212600000;
    var PIB_percapita = (PIB_2024 / populacao);

    println("O PIB percapita é igual a $PIB_percapita");
}