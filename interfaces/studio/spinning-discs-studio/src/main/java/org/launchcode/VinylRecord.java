package org.launchcode;

public class VinylRecord extends BaseDisc implements OpticalDisc{
    public VinylRecord(String name, String contents, double capacity, String discType) {
        super(name, contents, capacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("a vinyl record spins at 33 or 45 rpm");
    }

    @Override
    public void readDisc() {
        System.out.println("Playing music on vinyl record:" + getContents());

    }
}
