package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, String contents, double capacity, String discType) {
        super(name, contents, capacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void readDisc() {
        System.out.println("Reading from CD" + getContents());

    }
    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
