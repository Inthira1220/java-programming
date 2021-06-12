package day52_inheritance.discordUsers;

public class B22discordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Keada");
        user1.setRole("student");

        Admin admin1 = new Admin();
        admin1.setId(4567);
        admin1.setName("BABA");
        admin1.setRole("administration");

        System.out.println("user1 = " + user1);
        System.out.println("admin1 = " + admin1);

        Admin admin2 = new Admin("Gullia", 4138);
        System.out.println(admin2.toString());

    }
}
