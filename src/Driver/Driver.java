package Driver;

import Model.*;
import Repository.CommonRepo;
import Service.BookingService;
//import com.sun.deploy.net.HttpResponse;

import java.io.IOException;


public class Driver {


    public static void main(String[] args) throws IOException {

        Usr user = new Usr("John", "123");
        Model.Driver driver = new Model.Driver("D1", "0987", 0, 10,19,true,"swift","KA 123");

        Usr user1 = new Usr("John1", "1234");
        Model.Driver driver1 = new Model.Driver("D2", "09876", 0, 7,21,true,"swift","KA 123");

        Usr user2 = new Usr("John2", "12345");
        Model.Driver driver2 = new Model.Driver("D3", "098765", 0, 9,34,true,"swift","KA 123");

        CommonRepo repo = new CommonRepo();

        repo.addUser(user);
        repo.addUser(user1);
        repo.addUser(user2);

        repo.addDriver(driver);
        repo.addDriver(driver1);
        repo.addDriver(driver2);

        repo.updateUser("John","12345");
        repo.updateDriverLocation("D1",10,20);

        BookingService service = new BookingService();
        service.findRide("John1", 10, 20, 20, 30, repo);

        repo.getTotalEarning();

    }












}
