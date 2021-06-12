package day52_inheritance;

public class MobileApp {

    private String name;
    private double version;



    protected boolean download(){
        System.out.println("App: "+ name+ " version: "+ version+ " is download");
        return true;
    }


    public void useTheApp(int minute){
        System.out.println("Using "+ name+" app for "+minute + " minutes");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
