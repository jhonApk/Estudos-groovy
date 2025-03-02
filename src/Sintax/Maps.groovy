package Sintax

static void main(String[] args) {
    maps()
}

static void maps(){
    //os maps armazenam chave-valor
    // podemos acessar osa vlores usando a mapa['chave'] ou mapa.chave

    def map = [nome: "Marcos", idade: 28, cidade: "MA"]

    println(map['nome'])
    println(map.idade)

    //Adicionando uma nova chave
    map.pais = "Brasil"
    println(map)
}