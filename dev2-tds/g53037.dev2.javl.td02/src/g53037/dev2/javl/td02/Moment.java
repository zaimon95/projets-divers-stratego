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
public class Moment {

    private int hour;
    private int minute;
    private int second;

    public Moment(int hour, int minute, int second) {
        if (hour >= 23 || hour <= 0) {
            throw new IllegalArgumentException("heures plus grandes que 23 ou plus petites que 0");
        }
        if (minute >= 59 || minute <= 0) {
            throw new IllegalArgumentException("heures plus grandes que 23 ou plus petites que 0");
        }
        if (second >= 59 || second <= 0) {
            throw new IllegalArgumentException("heures plus grandes que 23 ou plus petites que 0");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Moment(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
    
    public boolean equals(Moment other){
        return other.hour == this.hour && other.minute == this.minute && other.second == this.second;
    }
    
    public int toSeconds(){
        return this.second + this.minute*60 + this.hour*3600;
    }
    
    public int compareTo(Moment otherMoment){
        int reponse = 0;
        if(this.equals(otherMoment)){
            reponse = 0;
        }
        else if(this.toSeconds() < otherMoment.toSeconds()){
            reponse = -1;
        }
        else if(this.toSeconds() > otherMoment.toSeconds()){
            reponse = 1;
        }
        return reponse;
    }
}
