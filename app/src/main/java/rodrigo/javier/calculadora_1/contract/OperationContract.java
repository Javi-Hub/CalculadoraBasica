package rodrigo.javier.calculadora_1.contract;

public interface OperationContract {

    interface view{
        void showResult(String result);
        void invalidOperation();
    }

    interface presenter{
        void showResult(String result);
        void invalidOperation();
        void add(int num1, int num2);
        void subtract(int num1, int num2);
        void multiply(int num1, int num2);
        void divide(int num1, int num2);
    }

    interface model{
        void add(int num1, int num2);
        void subtract(int num1, int num2);
        void multiply(int num1, int num2);
        void divide(int num1, int num2);

    }
}
