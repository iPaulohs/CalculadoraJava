package Operacoes;

public class Divisao extends OperationModel {
    @Override
    public void operationDouble(double a, double b) {
        System.out.println("O resultado da soma é "  + (a / b) + " e o resto é " + (a % b));
        super.operationDouble(a, b);
    }

    @Override
    public void operationInt(int a, int b) {
        double resultado = ((double) a / b);
        System.out.println("O resultado da soma é "  + resultado + " e o resto é " + (a % b));
        super.operationInt(a, b);
    }
}
