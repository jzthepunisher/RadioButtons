package spa.secciondos.radiobuttons;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup =(RadioGroup)findViewById(R.id.rdbGp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
                RadioButton rb2 = (RadioButton) findViewById(R.id.rdb2);
                RadioButton rb3 = (RadioButton) findViewById(R.id.rdb3);
                RadioButton rb4 = (RadioButton) findViewById(R.id.rdb4);
                RadioButton rb5 = (RadioButton) findViewById(R.id.rdb5);

                if (rb1.isChecked()) {
                    Toast.makeText(getBaseContext(), rb1.getText().toString() + " verificado!", Toast.LENGTH_LONG).show();
                } else {
                    if (rb2.isChecked()) {
                        Toast.makeText(getBaseContext(), rb2.getText().toString() + " verificado!", Toast.LENGTH_LONG).show();
                    } else {
                        if (rb3.isChecked()) {
                            Toast.makeText(getBaseContext(), rb3.getText().toString() + " verificado!", Toast.LENGTH_LONG).show();
                        } else {
                            if (rb4.isChecked()) {
                                Toast.makeText(getBaseContext(), rb4.getText().toString() + " verificado!", Toast.LENGTH_LONG).show();
                            } else {
                                if (rb5.isChecked()) {
                                    Toast.makeText(getBaseContext(), rb5.getText().toString() + " verificado!", Toast.LENGTH_LONG).show();

                                }
                            }
                        }
                    }
                }
            }
        });
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
}
