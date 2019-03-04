package css.edu.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Finding TextViews
        tvResult = (TextView) findViewById(R.id.textViewResult);

        //Gets width and length from main activity
        Intent intent = getIntent();
        //Double width = intent.getExtras().getDouble("etWidth");
        //Double length = intent.getExtras().getDouble("etLength");

        Bundle second = getIntent().getExtras();
        Double width = second.getDouble("etWidth");
        Double length = second.getDouble("etLength");


        //Calculates Result
        Double result = length * width;

        //Prints out final result
        String finalResult = "Width is " + width + " and length is " + length + " and flooring needed is " + new Double(result).toString();
        tvResult.setText(finalResult);





    }
    //Button Click method goes back to main activity
    public void buttonClickBack (View view){
        Intent intent = new Intent(ResultActivity.this,MainActivity.class);

        startActivity(intent);


    }



    }
