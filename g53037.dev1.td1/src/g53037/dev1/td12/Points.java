/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev1.td12;

/**
 *
 * @author simon
 */
public class Points {
    /**
     * 
     * @param p1
     * @param p2
     * @return the distance between both points with the formula SQRT((x_p1 - x_p2)^2 + (y_p1 - y_p2)^2)
     */
    static double distance (Point p1, Point p2){
        double d = Math.sqrt(Math.pow((p1.xAxis - p2.xAxis), 2) + Math.pow((p1.yAxis - p2.yAxis), 2));
        return d;
    }
    /**
     * 
     * @param p1
     * @param p2
     * @return a 3rd point which is in the middle of both
     */
    static Point middlePoint(Point p1, Point p2){
        double x3 = (p1.xAxis + p2.xAxis)/2;
        double y3 = (p1.yAxis + p2.yAxis)/2;
        return new Point(x3, y3);
    }
}
