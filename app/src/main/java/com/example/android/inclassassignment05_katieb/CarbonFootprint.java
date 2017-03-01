package com.example.android.inclassassignment05_katieb;

import java.io.Serializable;

/**
 * Created by katie on 2/27/17.
 */

public class CarbonFootprint implements Serializable {

    private String name;
    private int zipCode;
    private boolean noPlastic;
    private boolean ateVeg;
    private boolean noCar;


    public CarbonFootprint(String name, int zipCode, boolean noPlastic, boolean ateVeg, boolean noCar) {
        this.name = name;
        this.zipCode = zipCode;
        this.noPlastic = noPlastic;
        this.ateVeg = ateVeg;
        this.noCar = noCar;
    }

    public String getName() {
        return name;
    }

    public boolean isNoPlastic() {
        return noPlastic;
    }

    public boolean isAteVeg() {
        return ateVeg;
    }

    public boolean isNoCar() {
        return noCar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoPlastic(boolean noPlastic) {
        this.noPlastic = noPlastic;
    }

    public void setAteVeg(boolean ateVeg) {
        this.ateVeg = ateVeg;
    }

    public void setNoCar(boolean noCar) {
        this.noCar = noCar;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "CarbonFootprint" + "\n" +
                "Name: " + name + '\n' +
                "Zip Code: " + zipCode + "\n" +
                "No Plastic: " + noPlastic + "\n" +
                "Ate vegetarian: " + ateVeg + "\n" +
                "Did not use a car: " + noCar + "\n";
    }
}
