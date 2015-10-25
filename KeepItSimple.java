package anything.firefly.tipsy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class KeepItSimple extends MainActivity implements View.OnClickListener{

    Button button7, button8, button9, button10, button11;
    TextView bill_amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_it_simple);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String userInput = extras.getString("userInput");

        bill_amount = (TextView) findViewById(R.id.billAmount);
        bill_amount.setText(userInput);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);

        tenpercentcalc();
        fifteenpercentcalc();
        twentypercentcalc();
        twentyfivepercentcalc();
    }

    private void tenpercentcalc(){

        TextView ten_percent = (TextView) findViewById(R.id.textView4);
        double ten_result = Double.parseDouble(bill_amount.getText().toString());
        double result = ten_result * .1;
        double roundoff = Math.round(result * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff);
        ten_percent.setText(formatted);

    }

    private void fifteenpercentcalc(){

        TextView fifteen_percent = (TextView) findViewById(R.id.textView7);
        double fifteen_result = Double.parseDouble(bill_amount.getText().toString());
        double result2 = fifteen_result * .15;
        double roundoff2 = Math.round(result2 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff2);
        fifteen_percent.setText(formatted);

    }

    private void twentypercentcalc(){

        TextView twenty_percent = (TextView) findViewById(R.id.textView8);
        double twenty_result = Double.parseDouble(bill_amount.getText().toString());
        double result3 = twenty_result * .2;
        double roundoff3 = Math.round(result3 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff3);
        twenty_percent.setText(formatted);

    }

    private void twentyfivepercentcalc(){

        TextView twentyfive_percent = (TextView) findViewById(R.id.textView9);
        double twentyfive_result = Double.parseDouble(bill_amount.getText().toString());
        double result4 = twentyfive_result * .25;
        double roundoff4 = Math.round(result4 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff4);
        twentyfive_percent.setText(formatted);

    }

    private void button8Click(){

        TextView ten_percent = (TextView) findViewById(R.id.textView4);
        double ten_result = Double.parseDouble(bill_amount.getText().toString());
        double result = ten_result * .1;
        double roundoff = Math.round(result * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff);
        ten_percent.setText(formatted);

        Intent myIntent = new Intent(context,KeepItSimple2.class);
        String BillAmount = bill_amount.getText().toString();
        myIntent.putExtra("bill1", BillAmount);
        String TipAmount = ten_percent.getText().toString();
        myIntent.putExtra("tip1", TipAmount);
        startActivity(myIntent);
    }

    private void button9Click(){

        TextView fifteen_percent = (TextView) findViewById(R.id.textView7);
        double fifteen_result = Double.parseDouble(bill_amount.getText().toString());
        double result2 = fifteen_result * .15;
        double roundoff2 = Math.round(result2 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff2);
        fifteen_percent.setText(formatted);

        Intent myIntent2 = new Intent(context,KeepItSimple3.class);
        String BillAmount2 = bill_amount.getText().toString();
        myIntent2.putExtra("bill2", BillAmount2);
        String TipAmount2 = fifteen_percent.getText().toString();
        myIntent2.putExtra("tip2", TipAmount2);
        startActivity(myIntent2);

    }

    private void button10Click(){

        TextView twenty_percent = (TextView) findViewById(R.id.textView8);
        double twenty_result = Double.parseDouble(bill_amount.getText().toString());
        double result3 = twenty_result * .2;
        double roundoff3 = Math.round(result3 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff3);
        twenty_percent.setText(formatted);


        Intent myIntent = new Intent(context,KeepItSimple4.class);
        String BillAmount3 = bill_amount.getText().toString();
        myIntent.putExtra("bill3", BillAmount3);
        String TipAmount3 = twenty_percent.getText().toString();
        myIntent.putExtra("tip3", TipAmount3);
        startActivity(myIntent);

    }

    private void button11Click(){

        TextView twentyfive_percent = (TextView) findViewById(R.id.textView9);
        double twentyfive_result = Double.parseDouble(bill_amount.getText().toString());
        double result4 = twentyfive_result * .25;
        double roundoff4 = Math.round(result4 * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(roundoff4);
        twentyfive_percent.setText(formatted);

        Intent myIntent = new Intent(context,KeepItSimple5.class);
        String BillAmount4 = bill_amount.getText().toString();
        myIntent.putExtra("bill4", BillAmount4);
        String TipAmount4 = twentyfive_percent.getText().toString();
        myIntent.putExtra("tip4", TipAmount4);
        startActivity(myIntent);

    }

    private void button7Click(){

        Intent myIntent = new Intent(context,MainActivity.class);

        startActivity(myIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keep_it_simple, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button7:
                button7Click();
                break;

            case R.id.button8:
                button8Click();
                break;

            case R.id.button9:
                button9Click();
                break;

            case R.id.button10:
                button10Click();
                break;

            case R.id.button11:
                button11Click();
                break;
        }
    }
}
