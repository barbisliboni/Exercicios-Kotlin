fun main(){
//ex 1
    fun soma(a : Int, b : Int) : Int{ 
        val somar = a + b;
        return somar;
        }
    
    fun sub(a : Int, b : Int) : Int{
        val subt = a - b;
        return subt;
        }
    
    fun multi(a : Int, b : Int) : Int{
        val multip = a*b;
        return multip;
        }
    
    fun div(a : Int, b : Int) : Int{
        val divi = a/b;
        return divi;
        }

//ex 2
val pessoa1 = 17;
val pessoa2 = 18;

val pessoa = pessoa1;

if(pessoa>=18){
    println("Você é maior de idade!")
}else{
    println("Você ainda não tem 18 :(");
}


//ex 3
var num1 = 8;
var num2 = 7;
var num = num1;

if(num%2==0){
    println("Esse número é par!")
}else{
    println("Esse número é impar!")
}


//ex 4
var user1Email = "barbaralibonig@gmail.com";
var user1Senha = "lalala";

var email = user1Email;
var senha = user1Senha;

if(email != user1Email || senha != user1Senha){
    println("Sua senha e/ou email estão incorretos!")
}else{
    println("Você está logado!")
}


//ex 5
val imc = 25;
if(imc < 18.5){
    println("Você está abaixo do peso!")
}else if(imc >= 18.5 && imc <= 24.9){
    println("Você está no seu peso ideal!")
}else if(imc >= 25 && imc <= 29.9){
    println("Você está sobrepeso!")
}else if(imc >= 30 && imc <= 34.9){
    println("Você está com obesidade grau I")
}else if(imc >= 35 && imc <= 39.9){
    println("Você está com obesidade grau II")
}else{
    println("Você está com obesidade mórbida")
}


//ex 6
for (n in 0..10 ){
    val numero = 2;
    val conta = numero*n;
    val fim = "" + numero + " x " + n + " = " + conta;
    println(fim);
}

//ex 7
var vogal = arrayListOf("a", "e", "i", "o", "u");
var palavra = "Amigo";
    
for(vogal in palavra.length){
    if(vogal == palavra)
        println()
    
}


    }
    
