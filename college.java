package javajob;

    class Student {
        String name;
        static String collegeName;  // Shared by all students

        Student(String name) {
            this.name = name;
        }

        void display() {
            System.out.println(name + " - " + collegeName);
        }
    }

    public class college {
        public static void main(String[] args) {

            // Set college name initially
            Student.collegeName = "Western Illinois University";

            Student s1 = new Student("Komal");
            Student s2 = new Student("J");
            Student s3 = new Student("Teja");

            s1.display();
            s2.display();
            s3.display();

            System.out.println("\nChanging College Name...\n");

            // Change college name for all
            Student.collegeName = "University of Illinois";

            s1.display();
            s2.display();
            s3.display();
        }
    }


