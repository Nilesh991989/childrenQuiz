package nil.com.childrenquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callAnimalAcitity(View view){
        Intent i = new Intent(getApplicationContext(),AnimalQuizActivity.class);
        startActivity(i);
    }

    public void callBirdAcitity(View view){
        Intent i = new Intent(getApplicationContext(),BirdActivity.class);
        startActivity(i);
    }
}
