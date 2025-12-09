/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g53037.dev2.javl.td02;

/**
 *
 * @author g53037
 */
public class MainMoment {

    public static void main(String[] args) {
        Moment moment1 = new Moment(1, 2, 3);
        Moment moment2 = new Moment(1, 2, 3);
        Moment moment3 = new Moment(15, 28, 39);
        Moment moment4 = new Moment();
        System.out.println(moment1);
        System.out.println(moment2);
        System.out.println(moment3);
        System.out.println(moment4);
        System.out.println(moment1.equals(moment1));
        System.out.println(moment1.equals(moment2));
        System.out.println(moment1.equals(moment3));
        System.out.println(moment1.compareTo(moment2));
        System.out.println(moment1.compareTo(moment1));
        System.out.println(moment1.compareTo(moment3));
        System.out.println(moment1.compareTo(moment4));
    }
}
