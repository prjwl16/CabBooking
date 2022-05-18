package Model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class Driver {
    private String name;
    private String number;
    private long earning;
    private int x;
    private int y;
    private boolean status;
    private String vName;
    private String vNumber;

    public Driver(String name, String number, long earning, int x, int y) {
        this.name = name;
        this.number = number;
        this.earning = earning;
        this.x = x;
        this.y = y;
    }

    public Driver(String name, String number, long earning, int x, int y, boolean status, String vName, String vNumber) {
        this.name = name;
        this.number = number;
        this.earning = earning;
        this.x = x;
        this.y = y;
        this.status = status;
        this.vName = vName;
        this.vNumber = vNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getEarning() {
        return earning;
    }

    public void setEarning(long earning) {
        this.earning = earning;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", earning=" + earning +
                ", x=" + x +
                ", y=" + y +
                ", status='" + status + '\'' +
                ", vName='" + vName + '\'' +
                ", vNumber='" + vNumber + '\'' +
                '}';
    }
}
