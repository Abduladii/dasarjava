import javax.swing.*;
public class R_InputDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name?");
        System.out.println("My name si "+ name);
        System.exit(0);
    }
}
