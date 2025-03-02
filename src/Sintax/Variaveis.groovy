package Sintax

static void main(String[] args) {
    /* Def permite que o groovy infira automaticamente o tipo da variavel*/
    // declarar variavel com o tipo inferido automaticamente
    def nome = "teste"
    def idade = 20
    def cidade = "MA"
    def data = "29/03/1900"

    // Declaração explicita (como no java)

    int quantidade = 20
    String rua = "G"
    double troco = 4.15
    boolean verdadeiro = false

    //interpolação de strings como no kotlin
     println("meu nome é: $nome e tenho $idade anos")
}
