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

import anything.firefly.tipsy.R;

public class KeepItSimple4 extends MainActivity implements View.OnClickListener{

    TextView bill3, tip3, total3;
    Button mainmenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_it_simple4);

        fromButton10Click();

        mainmenu2 = (Button) findViewById(R.id.MainMenu2);
        mainmenu2.setOnClickListener(this);
    }

    private void fromButton10Click() {
        Intent myIntent = getIntent();
        String BillAmount = myIntent.getStringExtra("bill3");

        bill3 = (TextView) findViewById(R.id.twentyBill);
        bill3.setText(BillAmount);

        Intent intent = getIntent();

        String TipAmount = intent.getStringExtra("tip3");

        tip3 = (TextView) findViewById(R.id.twentyTip);
        tip3.setText(TipAmount);

        total3 = (TextView) findViewById(R.id.twentyTotal);
        double twentyTotal = Double.parseDouble(bill3.getText().toString()) + Double.parseDouble(tip3.getText().toString());
        double TotalRoundoff3 = Math.round(twentyTotal * 100.0) / 100.0;
        DecimalFormat DF = new DecimalFormat("0.00");
        String format = DF.format(TotalRoundoff3);
        total3.setText(format);

    }

    private void buttonMainMenu2Click(){

        Intent myIntent = new Intent(context,MainActivity.class);

        startActivity(myIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keep_it_simple4, menu);
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
            case R.id.MainMenu2:
                buttonMainMenu2Click();
                break;
        }
    }
}
