import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
class app{
    public static void main(String args[]) {
        int choice,number;
        Double type;
        Scanner input=new Scanner(System.in);
        System.out.println("****Ashwin's Parking System !!****\n");
        System.out.println("1.Check in\n");
        System.out.println("2.Find your vechicle\n");
        System.out.println("3.Check Out\n");
        choice = input.next().charAt(0);
        switch(choice){
            case 1:
            System.out.println("Enter the type of vechicle( 1 for car 2 for two wheeler)");
            type=input.nextDouble();
            System.out.println("Enter the vechicle number:");
            number=input.nextInt();
            //database work and print msg
            break;

            case 2:
            System.out.println("Enter the type of vechicle( 1 for car 2 for two wheeler)");
            type=input.nextDouble();
            System.out.println("Enter the vechicle number:");
            number=input.nextInt();





        }
    }
}