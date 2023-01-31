public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abigail Allado" , "Abi" , 20 , "2020-101713" , "Bachelor Of Science In Information Technology with Specilization in Multimedia Arts and Animation" , 1 , "Female");
        
        //Student 1
        System.out.println("Student 1");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s1.Name);
        System.out.println("Nickname: " + s1.Nickname);
        System.out.println("Age: " + s1.Age + " years old");
        System.out.println("Student Number: " + s1.StudentNumber);
        System.out.println("Course: " + s1.Course);
        System.out.println("Year Level: " + s1.YearLevel);
        System.out.println("Sex : " + s1.Sex);
        s1.play("Call Of Duty");
        System.out.println(" ");


        //Student 2
        System.out.println("Student 2");
        System.out.println("School: " + Student.SchoolName);
        System.out.println("Name: " + s2.Name);
        System.out.println("Name: " + s2.Nickname);
        System.out.println("Age: " + s2.Age + " years old");
        System.out.println("Student Number: " + s2.StudentNumber);
        System.out.println("Course: " + s2.Course);
        System.out.println("Year Level: " + s2.YearLevel);
        System.out.println("Sex : " + s2.Sex);
    }
}