fun main() {

    //ex 1
    val nome : String = "Bárbara";
    val sobrenome :String = "Liboni";

    var nomeCompleto : String = "Olá,"+ nome + " " + sobrenome;
    println(nomeCompleto);
    
    //ex 2
    var peso1 = "65.5";
	var peso2 = "68.8";

	var somaPesos = peso1 + peso2;
	println(somaPesos);
    
    
    //ex 3
    var num = 2;
    var aoQuadrado = num*num;

    println(aoQuadrado);


    //ex 4
    var num2 = 4;
    var dobro = num2*2;

    println(dobro);


    //ex 5
    var num3 = 5;
    var ante = num3-1;
    var suce = num3+1;

    println(ante);
    println(suce);


    //ex 6
    var meses = 7;
    var dias = 30;
    var totalMeDi = meses*dias;

    println(totalMeDi);


    //ex 7
    var nota1 = 5.5;
    var nota2 = 6.5;
    var nota3 = 4.2;
    var nota4 = 7.5;
    var nota5 = 8.2;

    var somaMedias = nota1 + nota2 + nota3 + nota4 + nota5;
    var media = somaMedias/5;
    println(media);


    //ex 8
    var metros = 8888.8f;
    var cm = metros*100;
    
    println(cm);


    //ex 9
    var valorProduto = 2500;
    var desconto = valorProduto/100;
    var descontoTotal = valorProduto - desconto;

    println(descontoTotal);
}

