package day54_abstraction;

public abstract class MyAbstractClass { //add abstract keyword and it can have the variable if you want
    /*
ABSTRACT CLASS:
- we add abstract keyword to class to make it abstract
- cannot be instantiated, we cannot create objects from abstract classes
- they are meant to be extended by sub classes, so in order to use a method or variable from the abstract class we need to have a subclass in the abstract class which extends the abstract class


 */
    int num = 55; //add variable
    public void learn(){
        System.out.println("Learning...");

    }
    public abstract void close(); //this is an abstract method/method with no implementation, just the signature. It only shows what class can do but not how to do it, so no body
                                    //once you create abstract in the public you dont have to put {} bcaz you want to hide it
}

class Sub extends MyAbstractClass{ //body will be implementation of subclass
    public void close(){        //its override from above
        System.out.println("close - abstract method implementation");
    }

        }



class myObject{
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass(); //no work in this way

        // in order to use a method or variable from the abstract class we need to have a subclass in the abstract class which extends the abstract class
        Sub sub = new Sub();
        sub.learn();
        System.out.println("sub.num = " + sub.num);
        sub.close();

    }
}
