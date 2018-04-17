package nil.com.childrenquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FruitQuestionList {
    List<Question> questionList = new ArrayList();
    Random r = new Random();

    public FruitQuestionList() {
        questionList.add(new Question(R.drawable.apple, "Apple", "Tamarind", "Pigeon", "Sparrow", "Apple"));
        questionList.add(new Question(R.drawable.banana, "Ostrich", "Banana", "Peacock", "Sparrow", "Banana"));
        questionList.add(new Question(R.drawable.coconut, "Parrot", "Cock", "Coconut", "Sparrow", "Coconut"));
        questionList.add(new Question(R.drawable.custardapple, "Tamarind", "Swan", "Parrot", "Custardapple", "Custardapple"));
        questionList.add(new Question(R.drawable.date, "Date", "Eagle", "Parrot", "Crow", "Date"));
        questionList.add(new Question(R.drawable.fig, "Swan", "Fig", "Ostrich", "Eagle", "Fig"));
        questionList.add(new Question(R.drawable.gooseberry, "Apple", "Sparrow", "Gooseberry", "Vulture", "Gooseberry"));
        questionList.add(new Question(R.drawable.grapes, "Tamarind", "Swan", "Crow", "Grapes", "Grapes"));
        questionList.add(new Question(R.drawable.guava, "Guava", "Ostrich", "Crow", "Vulture", "Guava"));
        questionList.add(new Question(R.drawable.jackfruit, "Parrot", "Jackfruit", "Owl", "Apple", "Jackfruit"));
        questionList.add(new Question(R.drawable.llemon, "Cock", "Eagle", "Lemon", "Crow", "Lemon"));
        questionList.add(new Question(R.drawable.lychee, "Cock", "Parrot", "Pigeon", "Lychee", "Lychee"));
        questionList.add(new Question(R.drawable.mongo, "Mongo", "Crow", "Peacock", "Sparrow", "Mongo"));
        questionList.add(new Question(R.drawable.orange, "Parrot", "Orange", "Eagle", "Sparrow", "Orange"));
        questionList.add(new Question(R.drawable.papaya, "Cock", "Swan", "Papaya", "Ostrich", "Papaya"));
        questionList.add(new Question(R.drawable.pineapple, "Owl", "Eagle", "Apple", "Pineapple", "Pineapple"));
        questionList.add(new Question(R.drawable.pomegranate, "Pomegranate", "Parrot", "Ostrich", "Eagle", "Pomegranate"));
        questionList.add(new Question(R.drawable.raisins, "Ostrich", "Raisins", "Peacock", "Vulture", "Raisins"));
        questionList.add(new Question(R.drawable.sapota, "Sparrow", "Swan", "Sapota", "Pigeon", "Sapota"));
        questionList.add(new Question(R.drawable.sweetlime, "Sparrow", "Ostrich", "Crow", "Sweetlime", "Sweetlime"));
        questionList.add(new Question(R.drawable.tamarind, "Tamarind", "Swan", "Owl", "Eagle", "Tamarind"));
        questionList.add(new Question(R.drawable.watermellon, "Apple", "Eagle", "Vulture", "Watermellon", "Watermellon"));
    }

    public Question getRandomQuestion(){
        int index = r.nextInt(questionList.size());
        return questionList.get(index);
    }
}
