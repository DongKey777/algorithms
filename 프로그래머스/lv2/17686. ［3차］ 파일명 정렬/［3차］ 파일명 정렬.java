/*
n < 1000
헤드 / 넘버 / 테일
헤드 넘버 테일을 나눠서
객체에 저장
객체는 정렬 기능
// 객체 만들기
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] files) {
        List<File> fileList = new ArrayList<>();

        StringBuilder sbH;
        StringBuilder sbN;
        StringBuilder sbT;

        for (String file : files) {
            sbN = new StringBuilder();
            sbH = new StringBuilder();
            sbT = new StringBuilder();
            for (int index = 0; index < file.length(); index++) {
                if (file.charAt(index) >= '0' && file.charAt(index) <= '9' && sbN.length() <= 4 && sbT.toString().equals("")) {

                    sbN.append(file.charAt(index));
                } else {
                    if (sbN.toString().equals("")) {
                        sbH.append(file.charAt(index));
                    } else {
                        sbT.append(file.charAt(index));
                    }
                }
            }
            fileList.add(new File(sbH.toString(), sbN.toString(), sbT.toString()));
        }

        Collections.sort(fileList);

        String[] answer = new String[files.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = fileList.get(i).getFileName();
        }

        return answer;
    }
}

class File implements Comparable<File> {
    String head;
    String number;
    String tail;

    File(String head, String number, String tail) {
        this.head = head;
        this.number = number;
        this.tail = tail;
    }

    public String getFileName() {
        return head + number + tail;
    }

    @Override
    public int compareTo(File o) {
        if (o.head.equalsIgnoreCase(this.head)) {
            return Integer.parseInt(this.number) - Integer.parseInt(o.number);
        } else {
            return this.head.toUpperCase().compareTo(o.head.toUpperCase());
        }
    }
}