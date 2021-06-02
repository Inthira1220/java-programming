package day48_constructors_static;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println("cs1.toString() = " + cs1.toString()); //lets print default
        cs1.setId(1);
        cs1.setName("BOB");
        System.out.println("cs1 = " + cs1); // no have to add.toString

        Customer cs2 = new Customer("Mike", 2); //<= assign value in the same line
        System.out.println("cs2 = " + cs2);

        Customer cs3 = new Customer("John Ward III", 4873);
        System.out.println("cs3 = " + cs3);
        
        //array of customer
        //           this is array -> multiple object
        // index                    0   1     2                  3   
        Customer[] todayCustomer ={cs1, cs2, cs3, new Customer("Bashir", 449)};
        
        //arrayList is Customer object
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("ABC", 4561)); //add more in the same line
        customerList.add(new Customer("BBB", 4567));
        customerList.add(new Customer("CCC", 4568));
        customerList.add(new Customer("DDD", 4569));

        //print 1st customer
        System.out.println("today 1st customer is =>"+todayCustomer[0]);

        //listOfCustomers.get(0).toString() = Customer{name='BOB', id=1}
        System.out.println("listOfCustomers.get(0).toString() = " + customerList.get(0).toString());

        //print all the customers
        System.out.println("listOfCustomers.toString() = " + customerList.toString());

        System.out.println("Loop Time with for loop");
        for (int i = 0; i < customerList.size(); i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("Loop Time with for each loop");
        for (Customer eachCustomer : customerList) {
            System.out.println("eachCustomer = " + eachCustomer);


        }
        System.out.println("-----------with lambda expression---------------");
        customerList.forEach(each-> System.out.println(each.getName()));


        //print all names of the customer in the list
        System.out.println("-----------print only the name---------------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.print(customerList.get(i).getName()+ ", ");
        }
        
        
        
    }
}
