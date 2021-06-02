package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("Int"));//case sensitive

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")){
            System.out.println("Maybe it is a female name");
        }

        name = "Mrs. Inthira";
        if (name.startsWith("Mr.")){
            System.out.println("Man");
        } else if (name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (name.startsWith("Mrs.")){
            System.out.println("Married Woman");
        }else if (name.startsWith("Ms.")){
            System.out.println("Single Women");
        }else if (name.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("GLMBTQ");
        }

    }
}

/*
 * Mr. -> Man
 * Dr. -> Doctor
 * Mrs.-> Married woman
 * Ms. -> Single woman
 * Sr. -> Senior
 */
