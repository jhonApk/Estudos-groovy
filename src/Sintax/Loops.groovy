package Sintax

static void main(String[] args) {
    //forLoopTradicional()
    //forComRange()
    whileLoop()
}

static void forLoopTradicional(){
    for (int i =0; i < 5; i++){
        println(i)
    }
}

static void forComRange(){
    //For simplificadoo com range
    /*O operador (..) cria um range de valores 1 a 5
    * O each itera sobra a sequencia*/

    (0..5).each {println(it)}
}

static void whileLoop(){
    def i = 0

    while(i <= 5){
        println(i)
        i++
    }
}
