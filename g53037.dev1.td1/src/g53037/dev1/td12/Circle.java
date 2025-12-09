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
public class Circle {
    Point c;
    double r;
    public Circle(double x, double y, double rayon){
        c = new Point(x, y);
        r = rayon;
    }
    public Circle(Point centre, double rayon){
        c = centre;
        r = rayon;
    }
    public String toString(){
        return "Cercle de rayon " + r + " et de centre " + c;
    }
}
