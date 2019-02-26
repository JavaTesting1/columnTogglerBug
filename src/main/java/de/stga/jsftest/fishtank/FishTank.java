package de.stga.jsftest.fishtank;

import java.io.Serializable;

public class FishTank implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String size;

    private String numberOfFish;

    private String colorOfFish;

    public FishTank(final String name, final String size, final String numberOfFish, final String colorOfFish) {
        super();
        this.name = name;
        this.size = size;
        this.numberOfFish = numberOfFish;
        this.colorOfFish = colorOfFish;
    }

    public String getColorOfFish() {
        return this.colorOfFish;
    }

    public String getName() {
        return this.name;
    }

    public String getNumberOfFish() {
        return this.numberOfFish;
    }

    public String getSize() {
        return this.size;
    }

}
