package Linesub;

import java.awt.Point;

public class LineSub extends Point {
    // The line is defined by an inherited 'begin' point and a separate 'end' point.
    private Point end;

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);              // Set the begin point
        this.end = new Point(endX, endY);   // Set the end point
    }

    public LineSub(Point begin, Point end) {
        super(begin.x, begin.y);  // Set the inherited Point's x and y
        this.end = end;
    }

    // toString method
    @Override
    public String toString() {
        return "LineSub[begin=(" + x + "," + y + "), end=(" + end.x + "," + end.y + ")]";
    }

    // Getters and Setters
    public Point getBegin() { return this; } // Since this object itself is the 'begin' point
    public Point getEnd() { return end; }

    public void setBegin(Point begin) {
        this.x = begin.x;
        this.y = begin.y;
    }

    public void setEnd(Point end) { this.end = end; }

    public int getBeginX() { return x; }
    public int getBeginY() { return y; }
    public int getEndX() { return end.x; }
    public int getEndY() { return end.y; }

    public void setBeginX(int x) { this.x = x; }
    public void setBeginY(int y) { this.y = y; }
    public void setBeginXY(int x, int y) { this.x = x; this.y = y; }
    public void setEndX(int x) { end.x = x; }
    public void setEndY(int y) { end.y = y; }
    public void setEndXY(int x, int y) { end.setLocation(x, y); }

    // Calculate the length of the line using the distance formula
    public double getLength() {
        int xDiff = end.x - this.x;
        int yDiff = end.y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Calculate the gradient (angle in radians)
    public double getGradient() {
        int xDiff = end.x - this.x;
        int yDiff = end.y - this.y;
        return Math.atan2(yDiff, xDiff);
    }
}

