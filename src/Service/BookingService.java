package Service;

import Model.Driver;
import Model.Usr;
import Repository.CommonRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingService {

    public void findRide(String name, int sx, int sy, int dx, int dy, CommonRepo repo){

        int source = sx + sy;
        int destination = dx + dy;

        ArrayList<Driver> availableDrivers = repo.availableDrivers(source);

        if(availableDrivers.isEmpty()){
            System.out.println("No ride found");
        }else{
            System.out.println("Please choose from the above available drivers: ");
            Scanner sc = new Scanner(System.in);
            int selectedDriver = sc.nextInt();
            Driver driver = availableDrivers.get(selectedDriver - 1);
            // Unlimited tries user has to select a ride.
            while(selectedDriver > availableDrivers.size()){
                    System.out.println("Please choose from available drivers: ");
                    selectedDriver = sc.nextInt();
            }
            driver.setStatus(false);

            System.out.println("Ride Started...!");
            Usr user = repo.getUser(name);
            user.setX(dx);
            user.setY(dy);

            driver.setX(dx);
            driver.setY(dy);

            System.out.println("Ride Ended...!");
            driver.setStatus(true);

            System.out.println("Your Bill Rupees: "+  (Math.abs(source - destination)+10));
            driver.setEarning((Math.abs(source - destination)+10));

        }

//            System.out.println("Driver Found: Name " + driver.getName() + " Vehicle "+ driver.getvName() + " "+ driver.getvNumber());
    }
}

