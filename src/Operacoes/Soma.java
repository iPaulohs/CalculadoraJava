package Operacoes;

public class Soma extends OperationModel {
    @Override
    public void operationDouble(double a, double b) {
        System.out.println("O resultado da soma é: "  + (a + b));
        super.operationDouble(a, b);
    }

    @Override
    public void operationInt(int a, int b) {
        System.out.println("O resultado da soma é: " + (a+ b));
        super.operationInt(a, b);
    }
}
