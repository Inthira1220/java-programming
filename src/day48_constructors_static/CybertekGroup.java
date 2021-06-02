package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");

        // print size of member
        System.out.println(group1.getMembers().size());

        // people
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());
        System.out.println("group1 = " + group1);


        Group group2 = new Group("Cybercat");
        group2.setMembers(Arrays.asList("Stephen", "Wekshum", "Akrem", "Bulent", "Andrea", "Andrei"));
        System.out.println("group2.getMembers() = " + group2.getMembers());

         if(group2.getMembers().contains("Akrem")){
             System.out.println("Yes,he is in group2");
         }else{
             System.out.println("NO, he is not in this group2");
         }
         group1.removeMember("Pavel");
         group1.removeMember("Elvin");
        System.out.println(group1);
        System.out.println("group 1 => "+group1.getMembers().size());



    }
}
