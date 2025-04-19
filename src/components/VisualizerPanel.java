package components;

import utils.Matrix;

import javax.swing.*;
import java.awt.*;

public class VisualizerPanel extends JPanel {
    public VisualizerPanel(){
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        /*
        JTextArea jTextArea = new JTextArea("Solutions: ", 10, 50);
        jTextArea.setLocation(100, 100);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        this.add(jScrollPane);
         */
    }

    @Override
    public void paint(Graphics graphics){
        int n = 7;
        Graphics2D graphics2D= (Graphics2D) graphics;
        graphics2D.setPaint(Color.RED);
        graphics2D.setFont(new Font("Ink Free", Font.BOLD, this.getWidth()*5/100));
        graphics2D.drawString("N-Queens Visualizer", this.getWidth()*27/100, this.getHeight()*10/100);
        graphics2D.setPaint(Color.BLACK);
        hr(graphics2D, 20);
        graphics2D.setFont(new Font("Ink Free", Font.BOLD, this.getWidth()*2/100));
        graphics2D.drawString("Look ahead approach: marking conflicts", this.getWidth()*5/100, this.getHeight()*25/100);
        graphics2D.drawString("Look behind approach: checking safety", this.getWidth()*55/100, this.getHeight()*25/100);
        Matrix matrix1 = new Matrix(this.getWidth(), this.getHeight(), 5, 28, 40, 35, n);
        matrix1.draw(graphics2D);
        Matrix matrix2 = new Matrix(this.getWidth(), this.getHeight(), 55, 28, 40, 35, n);
        matrix2.draw(graphics2D);
        graphics2D.setPaint(Color.ORANGE);
        matrix1.paintCell(graphics2D,3,4);
        graphics2D.setPaint(Color.ORANGE);
        matrix1.paintCell(graphics2D,3,3);
        hr(graphics2D, 70);
    }

    private void hr(Graphics2D graphics2D, int percentage){
        graphics2D.setStroke(new BasicStroke(2));
        int y = this.getHeight() * percentage/100;
        graphics2D.drawLine(0, y, this.getWidth(), y);
        graphics2D.setStroke(new BasicStroke(1));
    }
}
