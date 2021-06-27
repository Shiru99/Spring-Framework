package io.summer.Part9;

import java.util.ArrayList;
import java.util.List;

public class Polygon {

    List<Point> points = new ArrayList<Point>();

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {

        for (Point point : points) {
            point.pointDetails();
        }
       System.out.println();
    }
}