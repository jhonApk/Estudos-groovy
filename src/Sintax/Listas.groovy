package Sintax

static void main(String[] args) {
    opcoesEmLista()
}

static void lista01(){
    def lista = [1,2,3,4,5,6]
    lista.each {println(it)}

    def lista02 = ["Teste", "Filme", "Corrida", "Pipoca"]
    lista02.each {println(it)}
    //lista.each {it} percorre a lista e imprime cada elemento dela
}

static void opcoesEmLista(){
    //Adicionar elementes na lista
    def lista = [1,2,3]
    println(lista)
    lista << 6 //adiciona um elemento na lista (tipo o lista.add(6)
    //lista.add(4) tbm funciona normalmente

    println(lista)
    println(lista[2])

    //encontra elemento
    lista.add(5)
    lista << 9
    println(lista)

    println(lista.find{it > 3}) //encontra o primeiro numero maior que 3

    //Esse comando cria uma nova lista com valores dobrados
    println(lista.collect{it * 2})
}