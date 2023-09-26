package aurora;
import java.util.Scanner;
public class cincoprecios {
  public static void main(String[] args) {
      Scanner Leer=new Scanner(System.in);
      float a,b,c,d,e,r;
      System.out.print("Ingresa el primer precio:");
      a=Leer.nextFloat();
      System.out.print("Ingresa el segundo precio:");
      b=Leer.nextFloat();
      System.out.print("Ingresa el tercer precio:");
      c=Leer.nextFloat();
      System.out.print("Ingresa el cuarto precio:");
      d=Leer.nextFloat();
      System.out.print("Ingresa el quinto precio:");
      e=Leer.nextFloat();
      r=a+b+c+d+e;
      System.out.print("El total a pagar es:"+r);
    }
    
}
