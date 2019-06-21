import javax.swing.*;
public class Q6 {

    public static void main(String[] args) {
        JFrame f=new JFrame("hello world swing");
        final JLabel l=new JLabel("hello world");
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
