import javax.swing.*;

public class Ejercicio3While {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El número " +numero+ " es par");
            }else{
                System.out.println("El número " +numero+ " es impar");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        }

    }
}
