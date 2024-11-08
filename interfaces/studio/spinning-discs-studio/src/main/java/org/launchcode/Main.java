package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCD = new CD("Greatest Hits", "We are the champions", 700, "CD");
        myCD.spinDisc();
        myCD.readDisc();

        DVD myDVD = new DVD("Romactic movies collection", "Hallmark movie", 700, "DVD");
        myDVD.spinDisc();
        myDVD.readDisc();

        VinylRecord myVinyl = new VinylRecord("Greatest Hits", "Hotel California", 45, "Vinyl");
        myVinyl.readDisc();
        myVinyl.spinDisc();

        Frisbee myFrisbee = new Frisbee("Red Frisbee", "Rounded", 5, "Frisbee");
        myFrisbee.spinDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}