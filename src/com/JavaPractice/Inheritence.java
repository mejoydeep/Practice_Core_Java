package com.JavaPractice;

/**
 * Created by JC52036 on 24-01-2020.
 */
public class Inheritence {
    public int gear;
    public int speed;

    public Inheritence(int gear,int speed) {
        this.gear = gear;
        this.speed=speed;
    }
    public void applyBrake(int element){
        speed-=element;
    }
    public void speedUp(int element){
        speed+=element;
    }

    @Override
    public String toString() {
        return "Inheritence{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

class Childclass extends Inheritence{
    public int setHeight;

    public Childclass(int gear, int speed, int setHeight) {
        super(gear, speed);
        this.setHeight = setHeight;
    }

    public void setHeight(int height){
        setHeight=height;
    }

    @Override
    public String toString() {
        return "Childclass{" + super.toString()+
                "setHeight=" + setHeight +
                '}';
    }
}

class InheritanceMain{
    public static void main(String[] args) {
        Childclass c1=new Childclass(12,43,21);
        System.out.println(c1.toString());
    }
}
