import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
11
1 4
3 5
0 6
5 7
3 8
9 10
8 10
5 9
8 12
2 13
12 14
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Meeting> meetings = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(scanner.nextLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            meetings.add(new Meeting(start, end));
        }

        int answer = 0;
        int now = 0;
        Collections.sort(meetings);
        for (Meeting meeting : meetings) {
            if (now <= meeting.start) {
                answer++;
                now = meeting.end;
            }
        }

        System.out.println(answer);
    }
}

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if (o.end != end) {
            return this.end - o.end;
        } else {
            return this.start - o.start;
        }
    }
}