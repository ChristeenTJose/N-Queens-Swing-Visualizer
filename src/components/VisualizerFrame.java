package components;

import javax.swing.*;
import java.awt.*;

public class VisualizerFrame extends JFrame {
    VisualizerPanel visualizerPanel;

    public VisualizerFrame(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        visualizerPanel = new VisualizerPanel();
        this.add(visualizerPanel);
        this.pack();
    }
}
