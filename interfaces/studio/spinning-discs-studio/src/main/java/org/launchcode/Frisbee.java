package org.launchcode;

public class Frisbee extends BaseDisc implements Spinnable{
    public Frisbee(String name, String contents, double capacity, String discType) {
        super(name, contents, capacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Im spinning my frisbee");

    }
}
