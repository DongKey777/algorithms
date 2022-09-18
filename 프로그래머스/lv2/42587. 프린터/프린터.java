import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Job> jobQueue = new LinkedList<>();
        ArrayList<Job> jobDoneList = new ArrayList<>();
        
        boolean check = true;
        int answer = 0;
        
        for (int i=0; i<priorities.length; i++) {
            jobQueue.add(new Job(i, priorities[i]));
        }

        while(!jobQueue.isEmpty()) {
            Job temp = jobQueue.poll();
            
            for(Job j : jobQueue) {
                if (temp.priority < j.priority) {
                    jobQueue.add(temp);
                    check = false;
                    break;
                }
            }
            
            if (check) jobDoneList.add(temp);
            check = true;
        }
        
        for (int i=0; i< jobDoneList.size(); i++) {
            if (jobDoneList.get(i).index == location) answer = i+1;
        }
        return answer;
    }
}

class Job {
    int index;
    int priority;

    Job(int index, int priority){
        this.index = index;
        this.priority = priority;
    }
}