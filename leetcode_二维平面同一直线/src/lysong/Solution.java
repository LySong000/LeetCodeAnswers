package lysong;

/**
 * @Author: LySong
 * @Date: 2020/3/26 23:00
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length < 3) {
            return points.length;
        }
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int count = 0;
            int x = points[i].x;
            int y = points[i].y;
            int dx = x - points[i - 1].x;
            int dy = y - points[i - 1].y;
            if (dx == 0 && dy == 0) {
                for (int j = 0; j < points.length; j++) {
                    if (points[j].x == x && points[j].y == y) {
                        count++;
                    }
                }
            } else {
                for (int j = 0; j < points.length; j++) {
                    if ((points[j].x - x)*dy == (points[j].y - y)*dx) {
                        count++;

                    }
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
}

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}