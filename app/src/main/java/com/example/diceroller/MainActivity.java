package com.example.diceroller;

import android.app.Notification;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
    int score = 0;

    public void on_button_click(View view)
    {

        TextView tv = this.findViewById(R.id.numbertextView);
        TextView tv2 = this.findViewById(R.id.inputNumberValue);
        TextView tv3 = this.findViewById(R.id.correcttextView);
        TextView tv4 = this.findViewById(R.id.scoretextView);

        Random r = new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));
        int foundval = Integer.parseInt(tv2.getText().toString());


        if (foundval >0 || foundval <7)
        {

            if (foundval==number)
            {
                tv3.setText("Congratulations!");
                score = score+1;
            }
            else
            {
                tv3.setText("Incorrect!");
            }
        }
        else {
        }

        tv4.setText(String.valueOf(score));

    }

}
