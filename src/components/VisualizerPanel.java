package components;

import utils.Matrix;

import javax.swing.*;
import java.awt.*;

public class VisualizerPanel extends JPanel {
    public VisualizerPanel(){
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public void paint(Graphics graphics){
        Graphics2D graphics2D= (Graphics2D) graphics;
        hr(graphics2D, 20);
        Matrix matrix1 = new Matrix(this.getWidth(), this.getHeight(), 5, 28, 40, 35, 5);
        matrix1.draw(graphics2D);
        Matrix matrix2 = new Matrix(this.getWidth(), this.getHeight(), 55, 28, 40, 35, 5);
        matrix2.draw(graphics2D);
        matrix1.paintCell(graphics2D,3,4);
        hr(graphics2D, 70);
    }

    private void hr(Graphics2D graphics2D, int percentage){
        graphics2D.setStroke(new BasicStroke(2));
        int y = this.getHeight() * percentage/100;
        graphics2D.drawLine(0, y, this.getWidth(), y);
        graphics2D.setStroke(new BasicStroke(1));
    }
}
