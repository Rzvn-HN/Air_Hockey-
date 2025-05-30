package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;

    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection==0)
            randomYDirection--;
        setYDirection(randomYDirection);

    }

    public void setXDirection (int randomXDirection){
        xVelocity = randomXDirection;

    }

    public void setYDirection (int randomYDirection){
        yVelocity = randomYDirection;

    }

    public void move (){
        x += xVelocity;
        y += yVelocity;

    }

    public void draw (Graphics g){
        g.setColor(Color.black);
        g.fillOval(x,y,height,width);

    }

}
