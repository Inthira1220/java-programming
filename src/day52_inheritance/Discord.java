package day52_inheritance;

public class Discord extends MobileApp {

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord ");

    }

    @Override
    public boolean download() {
        System.out.println("downloaded discord 0.0.23 from App store ");
        return true;
    }


    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Name of someone");
    }

    public void printInfo() {
        System.out.println("App name = "+getName());
        System.out.println("App Version "+ getVersion());
    }

}
