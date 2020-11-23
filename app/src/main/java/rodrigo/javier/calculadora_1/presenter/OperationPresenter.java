package rodrigo.javier.calculadora_1.presenter;

import rodrigo.javier.calculadora_1.OperationActivityView;
import rodrigo.javier.calculadora_1.contract.OperationContract;
import rodrigo.javier.calculadora_1.model.OperationModel;

public class OperationPresenter implements OperationContract.presenter{

    private OperationActivityView view;
    private OperationModel model;

    public OperationPresenter(OperationActivityView view) {
        this.view = view;
        this.model = new OperationModel(this);
    }

    @Override
    public void showResult(String result) {
        if(view != null){
            view.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {
        if(view != null){
            view.invalidOperation();
        }
    }

    @Override
    public void add(int num1, int num2) {
        if (model != null){
            model.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (model != null){
            model.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (model != null){
            model.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (model != null){
            model.divide(num1, num2);
        }
    }

}
