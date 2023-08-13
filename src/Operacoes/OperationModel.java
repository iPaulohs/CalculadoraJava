package Operacoes;

import java.util.Scanner;

public class OperationModel {
    Scanner sc = new Scanner(System.in);

    public void questions() {
        System.out.println("Digite o primeiro número: ");
        String n1 = sc.nextLine();

        System.out.println("Digite o segundo número número: ");
        String n2 = sc.nextLine();
        try {
            int intNum1 = Integer.parseInt(n1);
            int intNum2 = Integer.parseInt(n2);

            operationInt(intNum1, intNum2);
        }catch(NumberFormatException e1){
            try{
                double doubleNum1 = Double.parseDouble(n1);
                double doubleNum2 = Double.parseDouble(n2);

                operationDouble(doubleNum1, doubleNum2);
            }catch(NumberFormatException e2){
                System.out.println("Entradas inválidas." + e2);
            }
        }
    }



    public void operationInt(int a, int b){
        System.out.println("_______________________________________");
    }

    public void operationDouble(double a, double b){
        System.out.println("_______________________________________");
    }
}

