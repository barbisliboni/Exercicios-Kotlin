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





    
    //Operadores lógicos
    //existem apenas três operadores lógicos: &&, || e !
    
    
    //Operador AND: &&
    //recebe dois booleanos e retorna apenas um, e retorna true caso os dois valores recebidos sejam iguais
    //println(true && true); //true
    //println(true && false); //false
    //println(false && true); //false
    //println(false && false); //false
    
    
    
    
    //Operador OR: ||
    //representa a lógica OU
    //println(true || true); //true
    //println(true || false); //true
    //println(false || true); //true
    //println(false || false); //false
    
    
    
    
    //Operador NOT: !
    //aceita um único valor de entrada e gera uma saída, ele inverte as ordens (ex de true vira false e vice versa)
    //println(!true);
    //println(!false);
    
    
    
    val idadeA= 35;
    val cnhA = true; 
    
    val idadeB = 18;
    val cnhB = false; 
    
    val idadeC = 17;
    val cnhC = true;
    
    val idade = idadeA; //int
    val cnh = cnhA; //boolean
    
    //println(idade >= 18 && cnh);
    
    
    
    
    //Estrutura condicional: If/else
    /*if(condição){
      }else{
      }
    */
    
	
    
    
    
    //if/else if/else
    
    val clima = "nublado";
    
    /*if(clima == "chuva"){
        println("Pegar um guarda-chuva!")
    }else if(clima == "sol"){
        println("Vamos sair!")
    }else if(clima == "nublado"){
        println("Pegar uma blusa de frio.")
    }else{
        println("Tanto faz!")
    }
    */
    
    
    
    if(idade >= 18 && cnh){
        println("Você pode comprar um carro! :)")
    }else{
        println("Você não pode comprar um carro! :(")
    }
    

    
    
