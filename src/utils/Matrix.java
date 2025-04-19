package utils;

import java.awt.*;

public class Matrix {
    private int x;
    private int y;
    private int w;
    private int h;
    private int n;
    private int dX;
    private int dY;

    public Matrix(int screenWidth, int screenHeight, int x, int y, int w, int h, int n){
        this.x = screenWidth * x/100;
        this.y = screenHeight * y/100;
        this.w = screenWidth * w/100;
        this.h = screenHeight * h/100;
        this.n = n;
        this.dX = this.w/this.n;
        this.dY = this.h/this.n;
    }

    public void draw(Graphics2D graphics2D){
        graphics2D.setStroke(new BasicStroke(5));
        graphics2D.drawRect(x, y, w, h);
        for(int i = 1; i < n; i++){
            graphics2D.drawLine(x, y + dY*i, x + w, y + dY*i);
        }
        for(int i = 1; i < n; i++){
            graphics2D.drawLine(x + dX*i, y, x + dX*i, y + h);
        }
        graphics2D.setStroke(new BasicStroke(1));
    }

    public void paintCell(Graphics2D graphics2D, int i, int j){
        graphics2D.fillRect(x + j*dX, y + i*dY, dX, dY);
    }

}
