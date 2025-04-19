package utils;

import java.awt.*;

public class Matrix {
    private int x;
    private int y;
    private int w;
    private int h;
    private int n;
    private float dX;
    private float dY;

    public Matrix(int screenWidth, int screenHeight, int x, int y, int w, int h, int n){
        this.x = screenWidth * x/100;
        this.y = screenHeight * y/100;
        this.w = screenWidth * w/100;
        this.h = screenHeight * h/100;
        this.n = n;
        this.dX = (float) this.w/this.n;
        this.dY = (float) this.h/this.n;
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setStroke(new BasicStroke(4));
        graphics2D.drawRect(x, y, w, h);
        for(int i = 1; i < n; i++){
            graphics2D.drawLine(x, (int) (y + dY*i), x + w, (int) (y + dY*i));
        }
        for(int i = 1; i < n; i++){
            graphics2D.drawLine((int) (x + dX*i), y, (int) (x + dX*i), y + h);
        }
        graphics2D.setStroke(new BasicStroke(1));
    }

    public void paintCell(Graphics2D graphics2D, int i, int j){
        graphics2D.fillRect((int) (x + j*dX) + 2, (int) (y + i*dY) + 2, (int) dX - 4, (int) dY - 4);
    }

}
