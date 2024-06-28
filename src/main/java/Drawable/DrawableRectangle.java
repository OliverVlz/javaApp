/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drawable;

import java.awt.Graphics;
import models.Point;
import models.Rectangle;
import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class DrawableRectangle extends Rectangle implements Drawable {

    public DrawableRectangle(Point start,int width, int height, Color color) {
        super(start, width, height, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(this.getStart().getX() - getWidth() / 2,
                   this.getStart().getY() - getHeight() / 2,
                   getWidth(), getHeight());
    }
    
}