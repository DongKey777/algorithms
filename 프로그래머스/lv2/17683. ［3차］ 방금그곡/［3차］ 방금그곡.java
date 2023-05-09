import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String m, String[] musicinfos) {

        List<Music> playList = new ArrayList<>();
        List<Music> playingList = new ArrayList<>();

        String newM = m
                .replaceAll("C#", "H")
                .replaceAll("D#", "I")
                .replaceAll("F#", "J")
                .replaceAll("G#", "K")
                .replaceAll("A#", "L")
                .replaceAll("E#", "Z")
                .replaceAll("B#","S");

        for (String musicifo : musicinfos) {

            String newMusicifo = musicifo
                    .replaceAll("C#", "H")
                    .replaceAll("D#", "I")
                    .replaceAll("F#", "J")
                    .replaceAll("G#", "K")
                    .replaceAll("A#", "L")
                    .replaceAll("E#", "Z")
                    .replaceAll("B#","S");

            int startHour = Integer.parseInt(newMusicifo.split(",")[0].split(":")[0]);
            int endHour;
            if (Integer.parseInt(newMusicifo.split(",")[1].split(":")[0]) == 0) {
                endHour = 24;
            } else {
                endHour = Integer.parseInt(newMusicifo.split(",")[1].split(":")[0]);
            }

            int startMin = Integer.parseInt(newMusicifo.split(",")[0].split(":")[1]);

            int endMin;
            if (Integer.parseInt(newMusicifo.split(",")[1].split(":")[1]) == 0) {
                endMin = 60;
            } else {
                endMin = Integer.parseInt(newMusicifo.split(",")[1].split(":")[1]);
            }

            int totalPlayingMin;

            totalPlayingMin = (endHour - startHour) * 60 + endMin - startMin;

            int noteLength = newMusicifo.split(",")[3].length();

            int q = totalPlayingMin / noteLength;
            int r = totalPlayingMin % noteLength;

            StringBuilder playedNote = new StringBuilder();
            for (int i = 0; i < q; i++) {
                playedNote.append(newMusicifo.split(",")[3]);
            }

            playedNote.append(newMusicifo.split(",")[3], 0, r);
            playList.add(new Music(newMusicifo.split(",")[2], playedNote.toString(), totalPlayingMin));
        }

        for (Music play : playList) {
            if (play.playedNote.contains(newM)) {
                playingList.add(play);
            }
        }
        Collections.sort(playingList);
        if (playingList.size() == 0) {
            return "(None)";
        } else {
            return playingList.get(0).title;
        }
    }
}

class Music implements Comparable<Music> {
    String title;
    String playedNote;
    int playedTime;


    Music(String title, String playedNote, int playedTime) {
        this.title = title;
        this.playedTime = playedTime;
        this.playedNote = playedNote;
    }

    @Override
    public int compareTo(Music o) {
        if (this.playedTime < o.playedTime) {

            return 1;
        }else if(this.playedTime == o.playedTime) return 0;
        else return -1;
    }
}




