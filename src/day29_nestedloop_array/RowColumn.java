package day29_nestedloop_array;

public class RowColumn {
    public static void main(String[] args) {
        for (int r = 0; r < 2; r++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("IRow"+ r + "-Column"+k+"| ");
            }
            System.out.println();
        }
    }
}
