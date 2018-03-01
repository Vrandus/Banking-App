package eecs1022.lab4;

import android.icu.text.DecimalFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.*;


public class BankActivity extends AppCompatActivity
{
    Bank bank;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        setTitle("EECS1022 W18 Lab 4: Bank Application");

    }

    private void setContentsOfTextView(int id, String newContents)
    {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);

    }

    private String getInputOfTextField(int id)
    {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    private String getItemSelected(int id)
    {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        return spinner.getSelectedItem().toString();
    }

    public void newClients(View view)
    {
        Client client1 = new Client(getInputOfTextField(R.id.client1), Double.parseDouble(getInputOfTextField(R.id.balance1)), "Client 1");
        Client client2 = new Client(getInputOfTextField(R.id.client2), Double.parseDouble(getInputOfTextField(R.id.balance2)), "Client 2");
        Client client3 = new Client(getInputOfTextField(R.id.client3), Double.parseDouble(getInputOfTextField(R.id.balance3)), "Client 3");
        bank = new Bank(client1, client2, client3);

        setContentsOfTextView(R.id.output, bank.toString());

    }

    public void completeTransaction(View view)
    {
        bank.transaction(getItemSelected(R.id.serviceSpinner), getItemSelected(R.id.fromAccount), getItemSelected(R.id.toAccount), getInputOfTextField(R.id.serviceValue));
        setContentsOfTextView(R.id.output, bank.toString());

    }


}
