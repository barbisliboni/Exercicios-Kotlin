fun main() {
    val x = 13; //int
    val y = 37; //int
    val z = 12.7; //double
    val w = 20.3; //double
    
    
    //operações aritméticas:
    //adição/soma: + 
    val somaInt = x + y; //int -> 50
    //println(somaInt);
    
    val somaDouble = z + w; //double -> 33
    //println(somaDouble);
    
    
    //subtração: -
    val subInt = x - y;
    //println(subInt);
    
    val subDouble = z - w;
    //println(subDouble);
    
    
    //divisão: /
    val divInt = x / y;
    //println(divInt);
    
    val divDouble = z / w;
    //println(divDouble);
    
    
    //multiplicação: *
    val multiInt = x * y;
    //println(multiInt);
    
    val multiDouble = z * w;
    //println(multiDouble);
    
    
    
   //módulo (resto da divisão) : inteiros: %
   val mod = y%x;
    //println(mod);
    
    //funções
    val usuario = "Bárbara"; //string
    val prof = "Thiago"; //string
    
    //código complexo
    dizOla();
    
    //código complexo
    dizOi(usuario);
    
    //código complexo
    dizOi(prof); //usuario é um argument
    
    //código complexo
    soma(17, 23);
    
    //código complexo
    val resultado = multi(17, 22);
    println(resultado);
       
}

//declarando uma função: fun
fun dizOla(){
    println("Olá");
}

//declarando função com parâmetros
fun dizOi(nome : String){ //so vai funcionar se receber uma string como parametro
    println("Olá, $nome :D");
    //o nome só está definido dentro da função
}

fun soma(a : Int, b : Int){ //sempre devo declarar o tipo de dado nos parametros
    println(a+b);
}


//declarando função com retorno
fun multi(a : Int, b : Int) : Int{ //o terceiro int é o tipo de retorno, no caso retornará um num inteiro
    val ab = a * b;
    return ab; 
}




//operadores relacionais 
    //sempre retornam true or false entre dois elementos
    var idadeBarbara = 18;
    var idadeThiago = 40;
    var idadeArthur = 18;
    
      println(idadeBarbara == idadeThiago); //false
      println(idadeBarbara == idadeArthur); //true
    
      println("Bárbara" == "Bárbara"); //true
      println("Bárbara" == "bárbara"); //false
    
    
    
    // operador de diferente: !=
    //vai retornar se dois elementos são diferentes ou não
    
      println(idadeBarbara != idadeThiago); //true
      println(idadeBarbara != idadeArthur); //false
    
      println("Bárbara" != "Bárbara"); //false
      println("Bárbara" != "bárbara"); //true
    
    
    
    
    //maior que: >
    //vai comparar se um elemento é maior que o outro
    
      println(idadeBarbara > idadeThiago); //false
      println(idadeBarbara > idadeArthur); //false
    
      println("Bárbara" > "Bárbara"); //false
      println("Bárbara" > "bárbara"); //false
    
    
    
    
    
    //menor que: >
    //vai comparar se um elemento é menor que o outro
    
      println(idadeBarbara < idadeThiago); //true
      println(idadeBarbara < idadeArthur); //false
    
      println("Bárbara" < "Bárbara"); //false
      println("Bárbara" < "bárbara"); //true   bárbara minúsculo deu true pois o programa sempre considera minúsucla maior que maiúscula
    
    
    
    
    //maior ou igual
    //compara se um elemento é maior ou igual a outro
    
      println(idadeBarbara >= idadeThiago); //false
      println(idadeBarbara >= idadeArthur); //true
    
      println("Bárbara" >= "Bárbara"); //true
      println("Bárbara" >= "bárbara"); //false
    
    
    
    
    //menor ou igual
    //compara se um elemento é menor ou igual a outro
    
      println(idadeBarbara <= idadeThiago); //true
      println(idadeBarbara <= idadeArthur); //true
    
      println("Bárbara" <= "Bárbara"); //true
      println("Bárbara" <= "bárbara"); //true
    
    
