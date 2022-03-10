package point;

public class PointDistanceCalculator {

    public static double calculateDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((b.y - a.y), 2) + Math.pow((b.x - a.x), 2));
    }

}
