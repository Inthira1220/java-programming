package After_Class;

public class CybertekNestedIfStatements {
    public static void main(String[] args) {

        String batchType = "EU";
        String selection = "evening";//allday
        System.out.println("In Cybertek we have three batch types: US morning, US evening, EU.");
        System.out.println("***************************************************************");
        if (batchType.equals("US batches")) {
            System.out.println("Figure out is it a morning batch or evening batch");
            if (selection.equals("morning")) {
                System.out.println(selection + ": Class times are 10-5 EST. M, T, Th, F.");
            } else if (selection.equals("evening")) {
                System.out.println(selection + ": Class times are 7-10 EST. M, T, W, Th, S, S ");
            }
        } else {

                System.out.println(batchType+ " All day Class times are  10-5 EST. M, T, W, Th, F");
            }

        }

}
/*
    Nested If statements
=======================================================

In Cybertek we have three batch types: US morning, US evening, EU.
Depending on a batch type (String) print information about the batch.

First figure out is is a US batch or EU batch

    - for US batches:

        > Figure out is it a morning batch or evening batch
            > morning - print: Class times are 10-5 EST. M, T, Th, F.
            > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

    - for EU batches:

        > print: Class times are  10-5 EST. M, T, W, Th, F.
 */