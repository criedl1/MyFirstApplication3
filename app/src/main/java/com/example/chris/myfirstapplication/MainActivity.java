package com.example.chris.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Show a toast
     * @param view -- the view that is clicked
     */
    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this,"Hello Toast!",Toast.LENGTH_SHORT);
        myToast.show();
    }
    /**
     * Count
     * @param view -- action clicking on the countButton
     */

    //Show left Toast

    /*public void toastLeft (View view){
        Toast leftToast = Toast.makeText(this,"Left Toast!",Toast.LENGTH_SHORT);
        leftToast.show();
    }*/

    //Left Button Snackbar

    public void snackbarLeft(View view){
    }

    //Show middle Toast
    public void toastMiddle(View view){
        Toast middleToast = Toast.makeText(this,"Middle Toast!",Toast.LENGTH_SHORT);
        middleToast.show();
    }

    //Show right Toast
    public void toastRight(View view){
        Toast rightToast = Toast.makeText(this,"Right Toast!",Toast.LENGTH_SHORT);
        rightToast.show();
    }


    public void countMe (View view){
        //Get the text view
        TextView showCountTextView= (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(count.toString());
    }
    public void randomMe(View view){

        //create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        //Get the Count
        //Get the TextView that shows the count
        TextView showCountTextView= (TextView) findViewById(R.id.textView);
        //Get the Value of the Textview
        String countString = showCountTextView.getText().toString();
        //Convert the Value
        Integer count = Integer.parseInt(countString);


        //Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT,count);
        //Start the new activity
        startActivity(randomIntent);




    }

}
