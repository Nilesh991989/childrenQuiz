package nil.com.childrenquiz;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class QuizActivity extends AppCompatActivity {
    private AnimalQuestionList animalQuestionList = new AnimalQuestionList();
    private BirdQuestionList birdQuestionList = new BirdQuestionList();
    private Question question;
    private TextToSpeech textToSpeech;
    private static final String CORRECT_ANSWER = "Answer is correct";
    private static final String WRONG_ANSWER = "Answer is incorrect";
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        value = getIntent().getExtras().getString("value");
        loadInitialQuiz();
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });
    }

    public Question getRandomQuestion() {
        Question question = null;
        switch (value){
            case "Animal" :
                question =  animalQuestionList.getRandomQuestion();
                break;
            case "Bird" :
                question =  birdQuestionList.getRandomQuestion();
                break;
        }
        return  question;
    }

    private void loadInitialQuiz(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        question =  getRandomQuestion();
        ImageView questionImg = findViewById(R.id.questionImg);
        questionImg.setImageResource(question.getImageId());

        Button button = findViewById(R.id.button);
        button.setText(question.getOption1());

        Button button1 = findViewById(R.id.button2);
        button1.setText(question.getOption2());

        Button button2 = findViewById(R.id.button3);
        button2.setText(question.getOption3());

        Button button3 = findViewById(R.id.button4);
        button3.setText(question.getOption4());
    }

    public void checkAns(View view) throws InterruptedException{
        Button button = findViewById(view.getId());
        boolean flag = button.getText().toString().equals(question.getCorrectAns()) ? true : false;
        if(flag){
            textToSpeech.speak(button.getText() + CORRECT_ANSWER, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(this, CORRECT_ANSWER,
                    Toast.LENGTH_SHORT).show();
            loadInitialQuiz();
        }else{
            textToSpeech.speak(button.getText() + WRONG_ANSWER, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(this, WRONG_ANSWER,
                    Toast.LENGTH_SHORT).show();
        }

    }
}
