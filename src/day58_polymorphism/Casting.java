package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //create object variable or worker and object of superMan
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).raiseKid();

        //DownCasting From worker to SuperMan
        SuperMan superMan = (SuperMan) worker;
        superMan.work("student");




    }
}
