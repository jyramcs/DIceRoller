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

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int score=0;
    int number=0;


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

    public int random_num_gen(){
        Random r = new Random();
        number = r.nextInt(6);
        return number;
    }

    public void on_button_click(View view) {
        TextView tv = this.findViewById(R.id.numbertextView);
        TextView tv2 = this.findViewById(R.id.inputNumberValue);
        TextView tv3 = this.findViewById(R.id.correcttextView);
        TextView tv4 = this.findViewById(R.id.scoretextView);

        random_num_gen();//calls random number generator

        tv.setText(Integer.toString(number));

        int foundval = Integer.parseInt(tv2.getText().toString());

        if (foundval >0 || foundval <7) {
            if (foundval==number) {
                tv3.setText("Congratulations!");
                score = score+1;
            }
            else {
                tv3.setText("Incorrect!");
            }
        }
        else {
        }

        tv4.setText(String.valueOf(score));

    }

    public void d_icebreaker(View view)
    {
        TextView tv5 = this.findViewById(R.id.numbertextView);

        ArrayList<String> list = new ArrayList<String>(); //create new array
        list.add("If you could go anywhere in the world, where would you go?");
        list.add("If you were stranded on a desert island, what three things would you want to take with you?");
        list.add("If you could eat only one food for the rest of your life, what would that be?");
        list.add("If you won a million dollars, what is the first thing you would buy?");
        list.add("If you could spaned the day with one fictional character, who would it be?");
        list.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");

        tv5.setText(list.get(random_num_gen()));

    }

}
