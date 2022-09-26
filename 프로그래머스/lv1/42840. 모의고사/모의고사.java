import java.util.*;
import java.lang.Math;

class Solution {
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    public int[] solution(int[] answers) {
        int[] method1 = {1,2,3,4,5};
        int[] method2 = {2,1,2,3,2,4,2,5};
        int[] method3 = {3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == method1[i % method1.length]) score1 ++;
            if (answers[i] == method2[i % method2.length]) score2 ++;
            if (answers[i] == method3[i % method3.length]) score3 ++;
        }

        if (score1==0 && score2 ==0 && score3==0) {
            return new int[]{};
        }  // 정답자가 없을떄

        ArrayList<Score> score = new ArrayList<Score>();
        score.add(new Score(1, score1));
        score.add(new Score(2, score2));
        score.add(new Score(3, score3));


        Collections.sort(score, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return o2.score - o1.score;
            }
        });

        for(Score s: score) {
            if (s.score == score.get(0).score) {
                answer.add(s.num);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public class Score{
        int num;
        int score;
        Score(int num, int score) {
            this.score = score;
            this.num = num;
        }
    }
}