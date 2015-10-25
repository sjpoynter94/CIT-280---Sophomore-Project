package anything.firefly.tipsy;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class KeepItSimple2 extends MainActivity implements View.OnClickListener {

    Button button12;
    TextView bill, tip, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_it_simple2);

        fromButton8Click();

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(this);
    }

    private void fromButton8Click() {
        Intent myIntent = getIntent();
        String BillAmount = myIntent.getStringExtra("bill1");

        bill = (TextView) findViewById(R.id.tenBill);
        bill.setText(BillAmount);

        Intent intent = getIntent();

        String TipAmount = intent.getStringExtra("tip1");

        tip = (TextView) findViewById(R.id.tenTip);
        tip.setText(TipAmount);

        total = (TextView) findViewById(R.id.tenTotal);
        double tenTotal = Double.parseDouble(bill.getText().toString()) + Double.parseDouble(tip.getText().toString());
        double TotalRoundoff = Math.round(tenTotal * 100.0) / 100.0;
        DecimalFormat DF = new DecimalFormat("0.00");
        String format = DF.format(TotalRoundoff);
        total.setText(format);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keep_it_simple2, menu);
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

    private void button12Click(){

        Intent myIntent = new Intent(context,MainActivity.class);
        startActivity(myIntent);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button12:
                button12Click();
                break;
        }
    }
}
