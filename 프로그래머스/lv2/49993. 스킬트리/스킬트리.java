import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        List<String> skillList = Arrays.asList(skill.split(""));
        int result = 0;

        for (String s : skill_trees) {
            String com = "";

            for (String c : s.split("")) {
                if (skill.contains(c)) {
                    com += c;
                }
            }

            if (skill.startsWith(com)) {
                result++;
            }
        }
        return result;
    }
}