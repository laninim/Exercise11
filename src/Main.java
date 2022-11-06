import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dataInput = new Scanner(System.in);
        House myhouse = null;

        System.out.println("Register form house ");

        //read number of floors
        int floorsNumber = 0;
        System.out.println("Insert number of floors: ");
        floorsNumber = dataInput.nextInt();

        dataInput.nextLine(); //discard newline (/n)

        //read address' house
        System.out.println("Insert the house's address: ");
        String address = "undefined";
        address = dataInput.nextLine();


        System.out.println("enter the resident list separated by a comma");
        String residents = dataInput.nextLine();
        String [] residentArray = null;
        if(!residents.contains(",")){
            System.out.println("Can't register house form, the resident must be separate from a comma");
            System.exit(1);
        }

        residentArray = residents.split(",");
        myhouse = new House(floorsNumber, address, residentArray);

        System.out.printf("House floors: %d \nAddress: %s \nResidents: %s", myhouse.getFloorsNumber(),myhouse.getAddress(), String.join(",",myhouse.getResidentsNames()));
    }
}