import java.util.Objects;
import java.util.Scanner;

/**
 * Created by marcus.rodrigues on 07/03/2015.
 */
public class Console {

    public static String lerString(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return(ler.nextLine());
    }

    public static int lerInt(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return (ler.nextInt());
    }

    public static Double lerDouble(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return (ler.nextDouble());
    }

    public static Boolean lerBoolean(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return (ler.nextBoolean());
    }
    public static float lerFloat(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return (ler.nextFloat());
    }

    public static char lerChar(Object input){

        System.out.print(input);
        Scanner ler = new Scanner(System.in);
        return (ler.next().charAt(0));
    }
}
