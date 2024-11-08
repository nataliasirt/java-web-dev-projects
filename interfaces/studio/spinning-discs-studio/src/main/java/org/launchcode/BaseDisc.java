package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private double capacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, String contents, double capacity, String discType) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}

