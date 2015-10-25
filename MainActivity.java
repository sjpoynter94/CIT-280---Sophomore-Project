package anything.firefly.tipsy;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button1, button2, button13;
    EditText userInput;
    Context context;
    EditText thebill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent myIntent = getIntent();
        String Billamount = myIntent.getStringExtra("bill");

        thebill = (EditText) findViewById(R.id.editText2);
        thebill.setText(Billamount);

        context = this.getApplicationContext();

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(this);

        userInput = (EditText) findViewById(R.id.editText2);
    }

    private void button2Click(){

        Intent myIntent = new Intent(context,HelpMeOut.class);
        myIntent.putExtra("userInput", userInput.getText().toString());
        if(userInput.getText().toString().isEmpty()) {
            userInput.setError("Don't forget to enter your bill here!");
        }
        else
            startActivity(myIntent);
    }

    private void button1Click(){
        Intent myIntent = new Intent(context,KeepItSimple.class);
        myIntent.putExtra("userInput", userInput.getText().toString());
        if(userInput.getText().toString().isEmpty()) {
            userInput.setError("Don't forget to enter your bill here!");
        }
        else
            startActivity(myIntent);
    }

    private void button13Click(){
        Intent myIntent = new Intent(context,SplitTheBill.class);
        myIntent.putExtra("userInput", userInput.getText().toString());
        if(userInput.getText().toString().isEmpty()) {
            userInput.setError("Don't forget to enter your bill here!");
        }
        else
            startActivity(myIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button:
            button1Click();
            break;

            case R.id.button2:
            button2Click();
            break;

            case R.id.button13:
                button13Click();
                break;

        }

    }
}
