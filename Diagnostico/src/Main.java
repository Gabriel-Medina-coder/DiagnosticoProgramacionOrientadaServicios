import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        int numero = 0;
        int sumatoria = 0;

        do {
            System.out.println("Ingresa un número");
            numero = sc.nextInt();
            numeros.add(numero);

            for (int i = 0; i< numeros.size();i++ ){
                System.out.println(String.valueOf(numeros.get(i)));
            }

            sumatoria = sumatoria + numero;

        }while (numero!=0);

        System.out.println(sumatoria);
    }
}