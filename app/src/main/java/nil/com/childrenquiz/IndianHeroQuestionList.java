package nil.com.childrenquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IndianHeroQuestionList {
    List<Question> questionList = new ArrayList();
    Random r = new Random();

    public IndianHeroQuestionList(){
        questionList.add(new Question(R.drawable.cock,"Cock","Parrot","Pigeon","Sparrow","Cock"));
        questionList.add(new Question(R.drawable.crow,"Ostrich","Crow","Peacock","Sparrow","Crow"));
        questionList.add(new Question(R.drawable.eagle,"Parrot","Cock","Eagle","Sparrow","Eagle"));
        questionList.add(new Question(R.drawable.ostrich,"Cock","Swan","Parrot","Ostrich","Ostrich"));

        questionList.add(new Question(R.drawable.owl,"Owl","Eagle","Parrot","Crow","Owl"));
        questionList.add(new Question(R.drawable.parrot,"Swan","Parrot","Ostrich","Eagle","Parrot"));
        questionList.add(new Question(R.drawable.peacock,"Ostrich","Sparrow","Peacock","Vulture","Peacock"));
        questionList.add(new Question(R.drawable.pigeon,"Sparrow","Swan","Crow","Pigeon","Pigeon"));

        questionList.add(new Question(R.drawable.sparrow,"Sparrow","Ostrich","Crow","Vulture","Sparrow"));
        questionList.add(new Question(R.drawable.swan,"Parrot","Swan","Owl","Eagle","Swan"));
        questionList.add(new Question(R.drawable.vulture,"Cock","Eagle","Vulture","Crow","Vulture"));
    }

    public Question getRandomQuestion(){
        int index = r.nextInt(questionList.size());
        return questionList.get(index);
    }
}
