/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Shape {
    Point start;
    protected Color color;

    public Shape(Point start, Color color) {
        this.start = start;
        this.color = color;
    }
    
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract double area();

     // Método abstracto para dibujar la figura
    public abstract void draw(Graphics g);
}