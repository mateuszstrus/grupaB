import java.util.Scanner;

public class Manual {


    public void obroty(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj obroty silnika do zmiany biegu: ");

        double bieg = scan.nextDouble();

        if( bieg <= 0){
            System.out.println("Nie można zmienic biegu");

        }else if( bieg > 0 && bieg <= 2000)
        {
            System.out.println("Poprawnie zmieniony bieg");
        }else
        {
            System.out.println("Nie piłuj silnika !!!");
        }


    }

}


