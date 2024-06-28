/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Drawable;

import models.Square;
import java.awt.Graphics;
import models.Point;
import java.awt.Color;

/**
 *
 * @author ESTUDIANTE
 */
public class DrawableSquare extends Square implements Drawable {

    public DrawableSquare(Point start, int side, Color color) {
        super(start, side, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(this.getStart().getX() - getSide() / 2,
                   this.getStart().getY() - getSide() / 2,
                   getSide(), getSide());
    }
}
