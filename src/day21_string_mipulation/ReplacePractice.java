package day21_string_mipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        //System.out.println(word.replace("hu", "la")); <--try myself to uppercase for some idea
        
        System.out.println(word.replace("hub", "lab").toUpperCase());
        System.out.println("word = " + word); // case print only print line not change from line 5
        word = word.replace("la", "hub");
        System.out.println("word = " + word);//gitlab
        System.out.println(word.replace("i", "o").replace("a", "i"));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", ""); //- คึอเอาช่องว่างออก
        System.out.println("withNoSpace = " + withNoSpace);
        
        sentence = sentence.replace("java", "selenium")
                           .replace("fun", "a lot of fun");//make different line easy for read
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for \"java book\"";
        //1-48ofover4,000resultsfor"javabook"
        result = result.replace("1-48 of over ", "")
                       .replace(" results for \"java book\"", "" )
                       .replace(",", "");
        //result = result.replace(" ", "").replaceAll("1-48ofover4,000resultsfor\"javabook\"", ("4,000"));
        System.out.println("result = " + result);








    }
}
