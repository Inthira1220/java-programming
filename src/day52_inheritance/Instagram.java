package day52_inheritance;

public class Instagram extends MobileApp {
    public void postPhoto() {
        System.out.println("posting picture on Instagram");
    }
    @Override
    public void useTheApp(int minute) {
        super.useTheApp(minute);
        System.out.println("Using instagram add features");
        postPhoto();



    }
}
