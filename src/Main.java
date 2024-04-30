import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Store 5 roll no's
        int[] roll = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Reference variable
        // Current value is null
        // new allocates memory at run time
        // dynamically means memory is allocated at run time
        Student temp = new Student();
        Student harsh = new Student(12,"Harsh",93.2F);
        Student random = new Student(harsh);

        System.out.println(harsh.rno);

    }
}