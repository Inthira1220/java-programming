package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        // "" ->to make out print become String not number
        System.out.println(technologies.indexOf(",")); //4 came out from 0-1-2-3 ->4
        // first comma
        System.out.println(technologies.lastIndexOf(","));//40
        //last comma
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index : " + indexOfJava);
        int inxOfCss = technologies.indexOf("css");
        System.out.println("Css is at index : "+inxOfCss);
        int inxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index : "+ inxOfCucumber);
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("Sql is at index : "+indexOfSql);

        // technologies contains "maven" ?
        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven") >- 1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
    }
}
