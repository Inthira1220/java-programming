package OfficeHours_Saim_Practice_03_02_2021;

public class ClassHouse {
    public static void main(String[] args) {
        String houseType = "Studio Apartment";
        int bedRoom = 1;
        int bathroom = 1;
        int kitchen = 1;
        char basement = 'N';
        char attic = 'N';
        char pool = 'Y';
        char isTheHouseForSale = 'Y';
        int costOfTheHouse = 300000;
        String address = "10519 Hunting Crest Lane, Vienna, Va.";
        int zipCode = 22182;
        char isAParkNearBy = 'Y';
        String ratingOfSurroundingSchoolDistricts = "5 out of 5";
        System.out.println("-----Sale House------ " + houseType);
        System.out.println("* Detail of "+ houseType+ " they include "+ bedRoom+ " bedroom, 1 bathroom, 1 kitchen ");
        System.out.println("* Basement: "+ basement );
        System.out.println("* Attic: "+ attic );
        System.out.println("* Pool: "+ pool + ".  The pool is in the Apartment community.");
        System.out.println("* Location: "+ address);
        System.out.println("* Zipcode: " + zipCode);
        System.out.println("* A park near by " + isAParkNearBy);
        System.out.println("* Rate of Place " + ratingOfSurroundingSchoolDistricts);
    }
}
/*Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms,
        number of kitchens, is there a basement?, is there an attic,
        is there a pool, is the house for sale?, cost of the house,
        address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */