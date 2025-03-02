package Sintax

static void main(String[] args) {
    ifElse()
    operadorTernario()
}

static void ifElse(){
    def idade = 15

    if (idade >= 18){
        println("Maior de idade")
    }else {
        println("Menor de idade")
    }
}

static void operadorTernario(){
    //O operador ternario é uma forma curta de escrever o if else
    def idade = 15

    def resultado = (idade >= 18) ? "Maior de idade Ternario": "Menor de idade Ternario"
    println(resultado)
}
