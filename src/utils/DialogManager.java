package utils;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogManager {
    
    public static void show(String title, String message, JFrame frame) {
        JOptionPane.showMessageDialog(frame,
            message,
            title,
            JOptionPane.INFORMATION_MESSAGE);
    }
}
