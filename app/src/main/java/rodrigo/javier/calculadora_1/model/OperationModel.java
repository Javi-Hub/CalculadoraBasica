package rodrigo.javier.calculadora_1.model;

import rodrigo.javier.calculadora_1.contract.OperationContract;
import rodrigo.javier.calculadora_1.presenter.OperationPresenter;

public class OperationModel implements OperationContract.model{

    private int result;
    private OperationPresenter presenter;

    public OperationModel(OperationPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void add(int num1, int num2) {
        result = num1 + num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 != 0){
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        } else {
            presenter.invalidOperation();
        }
    }

}
