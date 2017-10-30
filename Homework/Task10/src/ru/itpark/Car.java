package ru.itpark;

public class Car {
    private String model;
    private int fuelTankVol;
    private String typeOfFuel;
    private int fuelConsumption;
    private char vehicleSizeClasses;
    private int topSpeed;
    private int enginePower;

    private Car(Builder builder) {
        this.model = builder.model;
        this.fuelTankVol = builder.fuelTankVol;
        this.typeOfFuel = builder.typeOfFuel;
        this.fuelConsumption = builder.fuelConsumption;
        this.vehicleSizeClasses = builder.vehicleSizeClasses;
        this.topSpeed = builder.topSpeed;
        this.enginePower = builder.enginePower;
    }

    public static class Builder {
        private String model;
        private int fuelTankVol;
        private String typeOfFuel;
        private int fuelConsumption;
        private char vehicleSizeClasses;
        private int topSpeed;
        private int enginePower;


        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder fuelTankVol(int fuelTankVol) {
            this.fuelTankVol = fuelTankVol;
            return this;
        }

        public Builder typeOfFuel(String typeOfFuel) {
            this.typeOfFuel = typeOfFuel;
            return this;
        }

        public Builder fuelConsumption(int fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
            return this;
        }

        public Builder vehicleSizeClasses(char vehicleSizeClasses) {
            this.vehicleSizeClasses = vehicleSizeClasses;
            return this;
        }

        public Builder topSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public Builder enginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }


    public static Builder builder(){
        return new Builder();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelTankVol() {
        return fuelTankVol;
    }

    public void setFuelTankVol(int fuelTankVol) {
        this.fuelTankVol = fuelTankVol;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public char getVehicleSizeClasses() {
        return vehicleSizeClasses;
    }

    public void setVehicleSizeClasses(char vehicleSizeClasses) {
        this.vehicleSizeClasses = vehicleSizeClasses;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
