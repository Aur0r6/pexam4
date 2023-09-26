package sam;
import java.util.Scanner;
public class programa3 {
    public static void main(String[] args) {
     Scanner Leer=new Scanner(System.in);
     int k;
     int[] num = new int[9];
     for(k=0;k<=8;k++)
     {
         System.out.print("Ingresa un valor: ");
         num[k]=Leer.nextInt();
     }
    }   
}
