package nil.com.childrenquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callQuizAcitity(View view){
        Button button = findViewById(view.getId());
        Intent i = new Intent(getApplicationContext(),QuizActivity.class).putExtra("value",button.getText());
        startActivity(i);
    }
}
