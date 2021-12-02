public class Main {
    static public void main(String[] args) {
        Student student = new Student("Spiridonova Nariya", "student", 21);
        student.walk();
        student.run();
        student.voice();
        student.learn();
        System.out.println(student.toString());
        Teacher teacher = new Teacher("Ivanov Ivan Ivanovich", "teacher", 37);
        teacher.walk();
        teacher.run();
        teacher.voice();
        teacher.teach();
        System.out.println(teacher.toString());
    }
}