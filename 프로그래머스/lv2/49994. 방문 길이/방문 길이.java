import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public int solution(String dirs) {
        int x = 0;
        int y = 0;

        List<Position> history = new ArrayList<>();
        int distance = 0;
        for (String dir : dirs.split("")) {
            if (dir.equals("U")) {
                if (y + 1 > 5) {
                    continue;
                }

                Position position = new Position(x, y, x, y + 1);
                if (!history.contains(position)) {
                    distance++;
                    history.add(position);
                    history.add(new Position(x,y+1,x,y));
                }

                y += 1;
            }

            if (dir.equals("D")) {
                if (y - 1 < -5) {
                    continue;
                }

                Position position = new Position(x, y, x, y - 1);
                if (!history.contains(position)) {
                    distance++;
                    history.add(position);
                    history.add(new Position(x,y-1,x,y));
                }

                y -= 1;
            }

            if (dir.equals("R")) {
                if (x + 1 > 5) {
                    continue;
                }

                Position position = new Position(x, y, x + 1, y);
                if (!history.contains(position)) {
                    distance++;
                    history.add(position);
                    history.add(new Position(x+1,y,x,y));
                }
                x += 1;
            }

            if (dir.equals("L")) {
                if (x - 1 < -5) {
                    continue;
                }

                Position position = new Position(x, y, x - 1, y);
                if (!history.contains(position)) {
                    distance++;
                    history.add(position);
                    history.add(new Position(x-1,y,x,y));
                }
                x -= 1;
            }
        }
        return distance;
    }
}

class Position {
    int preX;
    int preY;
    int nowX;
    int nowY;

    Position(int preX, int preY, int nowX, int nowY) {
        this.preX = preX;
        this.preY = preY;
        this.nowX = nowX;
        this.nowY = nowY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return preX == position.preX && preY == position.preY && nowX == position.nowX && nowY == position.nowY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(preX, preY, nowX, nowY);
    }
}