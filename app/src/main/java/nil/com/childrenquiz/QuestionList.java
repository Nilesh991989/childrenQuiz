package nil.com.childrenquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionList {
    List<Question> questionList = new ArrayList();
    Random r = new Random();


    public QuestionList(){
        questionList.add(new Question(R.drawable.lion,"Lion","Elephant","Tiger","Dog","Lion"));
        questionList.add(new Question(R.drawable.elephant,"Lion","Elephant","Tiger","Dog","Elephant"));
        questionList.add(new Question(R.drawable.dog,"Lion","Elephant","Tiger","Dog","Dog"));
        questionList.add(new Question(R.drawable.tiger,"Lion","Elephant","Tiger","Dog","Tiger"));
        questionList.add(new Question(R.drawable.cat,"Dog","Rat","Cat","Rabbit","Cat"));
        questionList.add(new Question(R.drawable.rat,"Tiger","Rat","Cat","Rabbit","Rat"));
        questionList.add(new Question(R.drawable.ant,"Deer","Elephant","Tiger","Ant","Ant"));
        questionList.add(new Question(R.drawable.bear,"Lion","Bear","Tiger","Dog","Bear"));
        questionList.add(new Question(R.drawable.buffalo,"Buffalo","Elephant","Tiger","Dog","Buffalo"));
        questionList.add(new Question(R.drawable.butterfly,"Lion","Butterfly","Tiger","Dog","Butterfly"));
        questionList.add(new Question(R.drawable.camel,"Dog","Rat","Camel","Rabbit","Camel"));
        questionList.add(new Question(R.drawable.chimpanzee,"Chimpanzee","Rat","Cat","Chimpanzee","Chimpanzee"));
        questionList.add(new Question(R.drawable.deer,"Deer","Elephant","Tiger","Deer","Deer"));
        questionList.add(new Question(R.drawable.donkey,"Lion","Bear","Donkey","Dog","Donkey"));
        questionList.add(new Question(R.drawable.frog,"Frog","Elephant","Tiger","Dog","Frog"));
        questionList.add(new Question(R.drawable.giraffe,"snack","Butterfly","Giraffe","Dog","Giraffe"));
        questionList.add(new Question(R.drawable.goat,"Dog","Goat","Camel","Rabbit","Goat"));
        questionList.add(new Question(R.drawable.hippopotamus,"Tiger","Rat","Cat","Hippopotamus","Hippopotamus"));
        questionList.add(new Question(R.drawable.horse,"Deer","Elephant","Horse","Ant","Horse"));
        questionList.add(new Question(R.drawable.rabbit,"Lion","Bear","Tiger","Rabbit","Rabbit"));
        questionList.add(new Question(R.drawable.rhinoceros,"Rhinoceros","Elephant","Tiger","Dog","Rhinoceros"));
        questionList.add(new Question(R.drawable.sheep,"Lion","Butterfly","Sheep","Dog","Sheep"));
        questionList.add(new Question(R.drawable.snack,"Dog","Snack","Camel","Rabbit","Snack"));
        questionList.add(new Question(R.drawable.spider,"Tiger","Rat","Cat","Spider","Spider"));
        questionList.add(new Question(R.drawable.turtle,"Tiger","Turtle","Cat","Chimpanzee","Turtle"));
        questionList.add(new Question(R.drawable.zebra,"Zebra","Goat","Cat","snack","Zebra"));
    }

    public Question getRandomQuestion(){
        int index = r.nextInt(questionList.size());
        return questionList.get(index);
    }
}
