package css.edu.flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etWidth;
    EditText etLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);

    }

    //Button click goes forward to next screen while storing length and width put in by user
    public void buttonClickResult (View view){

        //Creates intent
        Intent intent = new Intent(MainActivity.this,ResultActivity.class);

        Bundle main = new Bundle();
        main.putString("etLength", etLength.getText().toString());
        main.putString("etWidth", etWidth.getText().toString());

        intent.putExtras(main);



        //intent.putExtra("etLength", etLength.getText().toString());
        //intent.putExtra("etWidth", etWidth.getText().toString());


        //Starts second Activity
        startActivity(intent);
    }
}
