import java.util.*;

class Solution {
    Queue<Word> queue = new LinkedList<>();
    int index;
    String name;
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];

        if (Arrays.asList(words).contains(target)) {
            bfs(begin, target, words, visited);
            return index;
        }else return 0;
    }

    public void bfs(String begin, String target, String[] words, boolean[] visited) {
        queue.add(new Word(begin, 0));

        while (!queue.isEmpty()) {
            Word word = queue.poll();
            name = word.word;
            index = word.index;

            if (name.equals(target)) return;
            for (int i=0; i<words.length; i++) {
                int count = 0;

                if (visited[i]) continue;

                for (int j=0; j<words[i].length(); j++) {
                    if (name.charAt(j) == words[i].charAt(j)) count ++;
                }

                if (count == name.length() -1) {
                    visited[i] = true;
                    queue.add(new Word(words[i], index+1));
                }
            }
        }

    }
}

class Word {
    String word ;
    int index ;

    Word(String word, int index) {
        this.word = word;
        this.index = index;
    }
}