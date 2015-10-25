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

public class KeepItSimple5 extends MainActivity implements View.OnClickListener {

    TextView bill4, tip4, total4;
    Button mainmenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_it_simple5);

        fromButton11Click();

        mainmenu3 = (Button) findViewById(R.id.MainMenu3);
        mainmenu3.setOnClickListener(this);
    }

    private void fromButton11Click() {
        Intent myIntent = getIntent();
        String BillAmount = myIntent.getStringExtra("bill4");

        bill4 = (TextView) findViewById(R.id.twentyfiveBill);
        bill4.setText(BillAmount);

        Intent intent = getIntent();

        String TipAmount = intent.getStringExtra("tip4");

        tip4 = (TextView) findViewById(R.id.twentyfiveTip);
        tip4.setText(TipAmount);

        total4 = (TextView) findViewById(R.id.twentyfiveTotal);
        double twentyfiveTotal = Double.parseDouble(bill4.getText().toString()) + Double.parseDouble(tip4.getText().toString());
        double TotalRoundoff4 = Math.round(twentyfiveTotal * 100.0) / 100.0;
        DecimalFormat DF = new DecimalFormat("0.00");
        String format = DF.format(TotalRoundoff4);
        total4.setText(format);

    }

    private void buttonMainMenu3Click(){

        Intent myIntent = new Intent(context,MainActivity.class);

        startActivity(myIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keep_it_simple5, menu);
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

        switch (v.getId()) {
            case R.id.MainMenu3:
                buttonMainMenu3Click();
                break;
        }
    }
}
