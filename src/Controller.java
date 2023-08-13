import Operacoes.Divisao;
import Operacoes.Multiplicacao;
import Operacoes.Soma;
import Operacoes.Subtracao;

import java.util.Scanner;

public class Controller {
    private boolean ativo = true;
    Scanner sc = new Scanner(System.in);

    public void questions(){
        System.out.println("Escolha uma operação a ser realizada:" +
                "\r\n 1 - Soma" +
                "\r\n 2 - Subtração" +
                "\r\n 3 - Multiplicação" +
                "\r\n 4 - Divisão" +
                "\r\n 5 - Sair");
        switchMethod();
    }

    public void switchMethod(){
        int resposta = sc.nextInt();

        while(ativo){
            switch (resposta){
                case 1:
                    Soma soma = new Soma();
                    soma.questions();
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    subtracao.questions();
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.questions();
                    break;
                case 4:
                    Divisao divisao = new Divisao();
                    divisao.questions();
                    break;
                case 5:
                    ativo = false;
                    break;
            }
            if(ativo){
                questions();
            }else{
                System.out.println("Até a próxima!");
            }
        }
    }
}
