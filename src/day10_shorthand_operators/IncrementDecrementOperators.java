package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i=" + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i=" + i);

        int linesOfCode = 15;
        System.out.println("Line Of Code = "+ linesOfCode);
        linesOfCode = linesOfCode + 1;
        linesOfCode +=1;
        linesOfCode++;  //common way
        ++linesOfCode;
        System.out.println("Line Of Code = "+ linesOfCode);

        // type 4 different ways decreasing by 1
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;   //common way
        --linesOfCode;
        System.out.println("Line Of Code = "+ linesOfCode);
        char letter = 'a';
        System.out.println("Letter = " + letter);
        letter++;
        System.out.println("Letter = " + letter);
        letter++;
        ++letter;
        System.out.println("Letter = " + letter);
        letter--;
        --letter;
        System.out.println("Letter = " + letter);
    }
}
