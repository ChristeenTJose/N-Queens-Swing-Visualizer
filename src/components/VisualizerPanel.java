package components;

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
        graphics2D.drawLine(0,0, this.getWidth(), this.getHeight());
    }
}
