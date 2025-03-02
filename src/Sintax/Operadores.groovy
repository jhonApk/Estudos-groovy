package Sintax

static void main(String[] args) {
    //operadoresAritimeticos()
    //operadoresAtribuicao()
    //operadoresRelacionais()
    //operadoresLogicos()
    //operadoresComparacaoAdicional()
    //operadoreDePropagacao()
    //elvisOperator()
    acessoSeguro()
}


static void  operadoresAritimeticos(){
    //similar ao java, mas possui outros exclusivos que tornam a ling mais expressiva

    def n1 = 10
    def n2 = 20

    def soma = n1 + n2
    def subtracao = n1 - n2
    def multiplicacao = n1 * n2
    def divisao = n1 / n2
    def moduloResto = n1 % n2
    def exponenciacao = 2 ** 3

    println("$n1 + $n2 = $soma")
    println("$n1 - $n2 = $subtracao")
    println("$n1 * $n2 = $multiplicacao")
    println("$n1 / $n2 = $divisao")
    println("$n1 % $n2 = $moduloResto")
    println("2 ** 3 = $exponenciacao")
}

static void operadoresAtribuicao(){
    def x = 3
    def y = 5

    def recebe = x //recebe 3
    y += 3 //atribui o valor de y + 3 ou seja 5 + 8
    println("y vale: $y")

    def a = 10

    a += 5   // Equivalente a: a = a + 5
    println a // 15

    a **= 2  // Equivalente a: a = a ** 2
    println a // 225

}

static  void operadoresRelacionais(){
    /*
    Operadores relacionais em groovy segue os mesmo de outrs linguagens

    == -> Igualdade
    != -> Diferente
    > -> maior que
    < -> Menor que
    >= -> maior igual
    <= -> Menor igual*/

    def idade = 18
    def permissao = 20

    println(idade == permissao) // false
    println(idade != permissao) //true
    println(idade > permissao) //False
    println(idade < permissao) //True
    println(idade >= permissao) // False
    println(idade <= permissao) //True
}

static  void operadoresLogicos(){
    // && -> E, || -> OU, ! -> Negação

    def a = true
    def b = false

    println(a && b) // para ser verdadeiro ambos precisar ser true
    println(a || b) // aqui apenas um precisa ser verdadeiro para retornar true
    println(!a) //vira false
    println(b) // vira true

    def idade = 15
    def acompanhada = true

    if (idade <= 17 && acompanhada == true){
        println("Entrada autorizada")
    }else if(idade >= 18){
        println("Entrada liberada")
    }
}

static  void operadoresComparacaoAdicional(){
    //Groovy possui operadores extras que não tem no java puro

    /*
    <==>  Comparação de  vias
     ==~  Correspondencia com Regex*/

    println(5 <=> 3) // 1 (5 é maior que 3)
    println(3 <=> 3) // 0 (São iguais )
    println(2 <=> 5) // -1 (2 é maior que 5)
}

static void operadoresDeColecao(){
    // Operador de inclusão "in"
    def lista = [1,2,3,4,6]
    println(3 in lista) //true
    println(10 in lista) //false
}

static void operadoreDePropagacao(){
    // O operador *. é usado para acesssar propriedades de todos os elementos de uma coleção

def pessoas = [new Pessoa(nome: "Ana"), new Pessoa(nome: "Carl")]
    println(pessoas*.nome)
}

class Pessoa{
    String nome
}

static void elvisOperator(){
    //O elvis Operator ?: é usado para fornecer um valor padrao se uma
    //váriavel for null ou false

    def nome = null
    def resultado = nome ?: "Sem nome"
    println(resultado)

    def requisicao = null
    def requisicaoError = requisicao ?: "Error 404"
    println(requisicaoError)
}

static void acessoSeguro(){
    def pessoa = null

    println(pessoa?.nome) //não da error. apenas retorna null
}
