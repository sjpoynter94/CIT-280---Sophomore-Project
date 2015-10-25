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

public class KeepItSimple3 extends MainActivity implements View.OnClickListener {

    TextView bill2, tip2, total2;
    Button mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_it_simple3);

        fromButtonClick9();

        mainmenu = (Button) findViewById(R.id.MainMenu);
        mainmenu.setOnClickListener(this);
    }

    private void fromButtonClick9() {
        Intent myIntent = getIntent();
        String BillAmount2 = myIntent.getStringExtra("bill2");

        bill2 = (TextView) findViewById(R.id.fifteenBill);
        bill2.setText(BillAmount2);

        Intent intent = getIntent();

        String TipAmount2 = intent.getStringExtra("tip2");

        tip2 = (TextView) findViewById(R.id.fifteenTip);
        tip2.setText(TipAmount2);

        total2 = (TextView) findViewById(R.id.fifteenTotal);
        double fifteenTotal = Double.parseDouble(bill2.getText().toString()) + Double.parseDouble(tip2.getText().toString());
        double TotalRoundoff2 = Math.round(fifteenTotal * 100.0) / 100.0;
        DecimalFormat DF = new DecimalFormat("0.00");
        String format = DF.format(TotalRoundoff2);
        total2.setText(format);

    }

    private void buttonMainMenuClick(){

        Intent myIntent = new Intent(context,MainActivity.class);

        startActivity(myIntent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keep_it_simple3, menu);
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
            case R.id.MainMenu:
                buttonMainMenuClick();
                break;
        }
    }
}
