package Repository;

import Model.Driver;
import Model.Usr;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class CommonRepo {
    ArrayList<Usr> users = new ArrayList<>();
    ArrayList<Driver> drivers = new ArrayList<>();

    public ArrayList<Usr> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usr> users) {
        this.users = users;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public void addUser(Usr user) {
        this.users.add(user);
    }
    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }

    public Usr getUser(String name) {
        for (Usr user : this.users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    public Driver getDriver(String name) {
        for (Driver driver : this.drivers) {
            if (driver.getName().equals(name)) {
                return driver;
            }
        }
        return null;
    }

    //The finding driver logic is if the driver's X and Y is sum of source X and Y is less than equal to or greater than equal 5 means driver is available
    public ArrayList<Driver> availableDrivers(int source){
        ArrayList<Driver> availableDrivers = new ArrayList<>();
        int i = 1;
        for (Driver driver : this.drivers) {
            int dest = driver.getX() + driver.getY();
            if((source - dest) <= 5 && (source - dest) >= -5 && driver.getStatus()){
                System.out.println(i+") Driver Available: " + driver.getName());
                availableDrivers.add(driver);
                i++;
            }
        }
        return availableDrivers;
    }



    public void updateUser(String name, String number){
        AtomicBoolean flag = new AtomicBoolean(true);
        users.forEach(u->{
            if(Objects.equals(u.getName(), name)){
                u.setNumber(number);
                flag.set(false);
            }
        });
        if(flag.get())
            System.out.println("User Not Found");
    }

    public void updateLocation(String name, int x, int y ){
        AtomicBoolean flag = new AtomicBoolean(true);

        users.forEach(u->{
            if(Objects.equals(u.getName(), name)){
                u.setX(x);
                u.setY(y);
            }
        });
        if(flag.get())
            System.out.println("User Not Found");
    }

    public void updateDriverLocation(String name, int x, int y ){
        AtomicBoolean flag = new AtomicBoolean(true);
        drivers.forEach(d->{
            if(d.getName().equals(name)){
                d.setX(x);
                d.setY(y);
                flag.set(false);
            }
        });
        if(flag.get())
            System.out.println("User Not Found");
    }

    public void changeDriverStatus(String name, boolean status){
        AtomicBoolean flag = new AtomicBoolean(true);
        drivers.forEach(d->{
            if(d.getName().equals(name)){
                d.setStatus(status);
                flag.set(false);
            }
        });
        if(flag.get())
            System.out.println("User Not Found");
    }

    public void getTotalEarning(){
        drivers.forEach(driver -> System.out.println(driver.getName() + " : " + driver.getEarning()));
    }
}
