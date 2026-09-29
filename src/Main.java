//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        int numerito1=18;
        int numero2=0;
        try {
            int resultado= numerito1/numero2;
            JOptionPane.showMessageDialog(null,"resultado:"+resultado);
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"no se puede dividir","error", JOptionPane.ERROR_MESSAGE);
        }
    }
}