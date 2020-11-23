package rodrigo.javier.calculadora_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import rodrigo.javier.calculadora_1.R;
import rodrigo.javier.calculadora_1.contract.OperationContract;
import rodrigo.javier.calculadora_1.presenter.OperationPresenter;

public class OperationActivityView extends AppCompatActivity implements OperationContract.view{

    private EditText edtNumber1, edtNumber2;
    private TextView txtResult;
    private OperationPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        presenter = new OperationPresenter(this);
    }

    public void initComponents(){
        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        txtResult = findViewById(R.id.txtResult);
    }

    public void doAdd(View view){
        try{
            int num1 = Integer.parseInt(edtNumber1.getText().toString());
            int num2 = Integer.parseInt(edtNumber2.getText().toString());
            presenter.add(num1, num2);

        }catch (NumberFormatException nfe){
            invalidOperation();
        }
    }
    public void doSubtract(View view){
        try{
            int num1 = Integer.parseInt(edtNumber1.getText().toString());
            int num2 = Integer.parseInt(edtNumber2.getText().toString());
            presenter.subtract(num1, num2);

        }catch (NumberFormatException nfe){
            invalidOperation();
        }
    }

    public void doMultiply(View view){
        try{
            int num1 = Integer.parseInt(edtNumber1.getText().toString());
            int num2 = Integer.parseInt(edtNumber2.getText().toString());
            presenter.multiply(num1, num2);

        }catch (NumberFormatException nfe){
            invalidOperation();
        }
    }
    public void doDivide(View view){
        try{
            int num1 = Integer.parseInt(edtNumber1.getText().toString());
            int num2 = Integer.parseInt(edtNumber2.getText().toString());
            presenter.divide(num1, num2);

        }catch (NumberFormatException nfe){
            invalidOperation();
        }
    }


    @Override
    public void showResult(String result) {
        txtResult.setText(result);
    }

    @Override
    public void invalidOperation() {
        Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show();
    }
}