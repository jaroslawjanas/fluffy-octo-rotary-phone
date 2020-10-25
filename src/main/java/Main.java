import musical_octo_pancake.*;
import musical_octo_pancake.Module;

public class Main {

    //Taken from:
    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //-------------------------

    public static void main (String[] args) {
        Student s1, s2, s3;
        s1 = new Student("Josh Withasurname", "19/01/1997");
        s2 = new Student("Not Nathan", "03/11/1999");
        s3 = new Student("Keanu Reeves", "24/12/1543");

        Module m1, m2, m3;
        m1 = new Module("Shoftware Engineering", "SHOFT1");
        m2 = new Module("Machine Learning", "AI42");
        m3 = new Module("Graphics and Image Processing", "WUT99");

        Course csit = new Course("Computer Science");
        csit.setStarDate("27/01/2019");
        csit.setEndDate("29/06/2021");
        
        m1.addStudent(s1);
        m1.addStudent(s3);
        m2.addStudent(s2);
        m2.addStudent(s3);
        m3.addStudent(s3);
        m3.removeStudent(s3);

        csit.addModule(m1);
        csit.addModule(m2);
        csit.addModule(m3);

        System.out.println(ANSI_RED + "~~ Courses ~~" + ANSI_RESET);
        System.out.println(csit);
        System.out.println("--------------------");
        System.out.println(ANSI_GREEN + "~~ Modules ~~" + ANSI_RESET);
        System.out.println(m1);
        System.out.println("--------------------");
        System.out.println(m2);
        System.out.println("--------------------");
        System.out.println(m3);
        System.out.println("--------------------");
        System.out.println(ANSI_YELLOW + "~~ Students ~~" + ANSI_RESET);
        System.out.println(s1);
        System.out.println("--------------------");
        System.out.println(s2);
        System.out.println("--------------------");
        System.out.println(s3);
    }
}
