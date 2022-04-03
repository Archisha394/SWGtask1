public class Student{
    static String name;
    static int rollno;
    static float attendance;
    static float marks;
    Student(String name,float marks,float attendance)
    {
        Student.name=name;
        Student.marks=marks;
        Student.attendance=attendance;
    }
    public void InputName(String name) {
        Student.name = name;
    }
    public String OutputName() {
        return name;
    }
    public void InputAttendance(float attendance) {
        Student.attendance = attendance;
    }
    public double OutputAttendance() {
        return attendance;
    }
    public void InputMarks(float marks){
        if(marks<0)
        {
            marks=0;
        }
        Student.marks = marks;
    }
    public float OutputMarks() {
        if(marks<0)
        {
            marks=0;
        }
        return marks;
    }
    public static void main(String[] args)
    {
        Student student_1 = new Student("Soujanya",95,76);
        if(student_1.OutputAttendance()>75)
        {
            student_1.InputMarks(student_1.OutputMarks()*(float)1.1);
        }
        if(student_1.marks>100&&student_1.attendance>75){
            student_1.marks=100;
        }
        System.out.println(name + " got " + student_1.OutputMarks());

        Student student_2 = new Student("Archisha",87,66);

        if(student_2.OutputAttendance()>75){
            student_2.InputMarks(student_2.OutputMarks()*(float)1.1);
        }
        if(student_1.marks>100&&student_1.attendance>75){
            student_1.marks=100;
        }
        System.out.println(name + " got " + student_2.OutputMarks());
    }
}
