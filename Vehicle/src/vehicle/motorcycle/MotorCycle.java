package vehicle.motorcycle;

public class MotorCycle {

    private String Brand;
    int wheel;
    int headLight;
    private String engine;
    String breakingType;
    int milage;

    public MotorCycle() {
    }

    public MotorCycle(String Brand, int wheel, int headLight, String engine, String breakingType, int milage) {
        this.Brand = Brand;
        this.wheel = wheel;
        this.headLight = headLight;
        this.engine = engine;
        this.breakingType = breakingType;
        this.milage = milage;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getHeadLight() {
        return headLight;
    }

    public void setHeadLight(int headLight) {
        this.headLight = headLight;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBreakingType() {
        return breakingType;
    }

    public void setBreakingType(String breakingType) {
        this.breakingType = breakingType;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void GetVehicleDetails() {

        System.out.println("Brand:" + this.Brand + "\n"
                + "wheel:" + this.wheel + "\n"
                + "headLight:" + this.headLight + "\n"
                + "breakingType:" + this.breakingType + "\n"
                + "milage:" + this.milage + "\n"
                + "engine:" + this.engine + "\n"
        );

    }

}
