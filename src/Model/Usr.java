package Model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class Usr {
    private String name;
    private String number;
    private int x;
    private int y;


    public Usr(String name, String number, int x, int y) {
        this.name = name;
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public Usr(String name, String number) {
        this.name = name;
        this.number = number;
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

    @Override
    public String toString() {
        return "Usr{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

}
