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
public class Circles {
    static double aire(Circle c){
        return Math.pow(c.r, 2)*Math.PI;
    }
    static double perimetre(Circle c){
        return c.r*2*Math.PI;
    }
    static Circle middleCircle(Circle c1, Circle c2){
        double rayon = Points.distance(c1.c, c2.c)/2;
        Point centre = Points.middlePoint(c1.c, c2.c);
        return new Circle(centre, rayon);
    }
    static boolean isADiskMember(Circle c, Point p){
        return Points.distance(p, c.c) < c.r;
    }
    static boolean haveIntersectionPoint(Circle c1, Circle c2){
        double distance = Points.distance(c1.c, c2.c);
        double somme_rayon = c1.r + c2.r;
        return distance < somme_rayon;
    }
}
