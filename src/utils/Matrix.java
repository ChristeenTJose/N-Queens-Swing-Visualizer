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
        graphics2D.setStroke(new BasicStroke(5));
        graphics2D.drawRect(x, y, w, h);
        for(int i = 1; i < n; i++){
            graphics2D.drawLine(x, (int) (y + i*dY), x + w, (int) (y + i*dY));
        }
        for(int j = 1; j < n; j++){
            graphics2D.drawLine((int) (x + j*dX), y, (int) (x + j*dX), y + h);
        }
        graphics2D.setStroke(new BasicStroke(1));
    }

    public void paintCell(Graphics2D graphics2D, int i, int j){
        //graphics2D.setPaint(new Color(1, 1, 1, 1));
        //graphics2D.fillRect((int) (x + j*dX), (int) (y + i*dY), (int) dX, (int) dY);
        graphics2D.setPaint(new Color(0,0,1,0.9f));
        graphics2D.fillRect((int) (x + j*dX), (int) (y + i*dY), (int) dX, (int) dY);
        graphics2D.setStroke(new BasicStroke(5));
        graphics2D.setPaint(Color.black);
        graphics2D.drawRect((int) (x + j*dX), (int) (y + i*dY), (int) dX, (int) dY);
        graphics2D.setStroke(new BasicStroke(1));
    }

}
