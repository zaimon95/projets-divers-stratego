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
public class Point {
    double xAxis;
    double yAxis;
    public Point(double X, double Y){
        xAxis = X;
        yAxis = Y;
    }
    public String toString(){
        return "(" + String.format("%.2f", xAxis) + ";" + String.format("%.2f", yAxis) + ")";
    }
    
}
