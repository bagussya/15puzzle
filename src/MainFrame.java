// impor class
import java.awt.*;
import javax.swing.*;

//deklarasi class
public class MainFrame {
    
    public MainFrame(){
      
        JFrame frame = new JFrame();    //window
        
        JPanel panel = new JPanel();    //layout di windownya
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,300,300));  //border layout
        panel.setLayout(new GridLayout());  //layout
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("15 Puzzle");    //judul window
        frame.pack();
        frame.setVisible(true);
    }
}


