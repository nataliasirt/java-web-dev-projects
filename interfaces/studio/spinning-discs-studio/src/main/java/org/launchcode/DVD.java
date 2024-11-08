package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, String contents, double capacity, String discType) {
        super(name, contents, capacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void readDisc() {
        System.out.println("Reading from DVD" + getContents());

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
