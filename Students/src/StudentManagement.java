import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            List<Student> studentList = new ArrayList<Student>();

            while (true) {
                System.out.println("1 to add the student" +
                        "\n2 to update the student" +
                        "\n3 to delete the student" +
                        "\n4 to view the student" + "" +
                        "\n5 to sort list by age" +
                        "\nAny other key to Exit");

                String userAction = sc.nextLine();

                if (userAction.equals("1")) {
                    System.out.println("Enter the name of the student you want to add");
                    String name = sc.nextLine();

                    System.out.println("Enter the age of the student you want to add");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the major of the student you want to add");
                    String major = sc.nextLine();



                    studentList.add(new Student(name, age, major));
                    System.out.println("The student list is added");


                } else if (userAction.equals("2")) {
                    System.out.println("Enter the index of the studentlist you want to update");
                    int index = sc.nextInt();

                    if (index >= 0 && index < studentList.size()) {
                        System.out.println("Enter the name of the student you want to add");
                        String name = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Enter the major of the student you want to add");
                        String major = sc.nextLine();

                        System.out.println("Enter the age of the student you want to add");
                        int age = sc.nextInt();

                        sc.nextLine();
                        studentList.get(index).setName(name);
                        studentList.get(index).setAge(age);
                        studentList.get(index).setMajor(major);
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Invalid index");
                    }
                } else if (userAction.equals("3")) {
                    System.out.println("Enter the index of the studentlist you want to delete");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index < studentList.size()) {
                        studentList.remove(index);
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Invalid index");
                    }
                } else if (userAction.equals("4")) {
                    studentList.forEach(student -> System.out.println(student));
                } else if (userAction.equals("5")) {
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student s1,Student s2){
                            return Integer.compare(s1.getAge(),s2.getAge());
                        }
                            });
                    studentList.forEach(student -> System.out.println(student));
                    System.out.println("Student list sorted by age in ascending order");

                }
                else {
                    break;
                }
            }


        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

}