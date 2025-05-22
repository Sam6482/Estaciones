import java.swing.JOptionPane;
import java.util.Scanner;

public class Estaciones{
    private static final Scanner teclado = new Scanner(System.in);

    public static int ObtnerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = teclado.nextInt();
        teclado.nextLine();
        return numeroTemporal;
    }

     public static void main(String[] args){
        int option = ObtnerNumero("Enter a number 1 - 12");

        switch(option){
            case 1 :
            case 2 :
            case 12 :

                JOptionPane.showMessageDialog(null, "winter go with your friends");

            break;

            case 3 :
            case 4 :
            case 5 :

                JOptionPane.showMessageDialog(null, "spring is beautiful");

            break;

            case 6 :
            case 7 :
            case 8 :

                JOptionPane.showMessageDialog(null, "the summer is crazy");

            break;

            case 9 :
            case 10 :
            case 11 :

                JOptionPane.showMessageDialog(null, "Autum you should listen Metallica ");

            break;

            default:
                 JOptionPane.showMessageDialog(null, " noob ");

        }

     }
}