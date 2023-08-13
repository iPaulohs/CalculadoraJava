package Operacoes;

public class Multiplicacao extends OperationModel {
    @Override
    public void operationDouble(double a, double b) {
        System.out.println("O resultado da multiplicação é: "  + (a * b));
        super.operationDouble(a, b);
    }

    @Override
    public void operationInt(int a, int b) {
        System.out.println("O resultado da multiplicação é: " + (a+ b));
        super.operationInt(a, b);
    }
}
