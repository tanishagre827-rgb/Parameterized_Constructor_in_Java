import java.util.Scanner;

class Stud {
    int rollNo;
    String name;

    // Parameterized Constructor
    Stud(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        // Object creation using user input
        Stud s = new Stud(r, n);
        s.display();

        sc.close();
    }
}
