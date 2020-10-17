package mvc_demonstration;

public class mvcdemo {
    public static void main(String[] args) {
        student md = retriveStudentfromdatabase();  //getting the data from database but here we dont have data base
        student_view vw = new student_view();
        student_controller contrl = new student_controller(md,vw);
        contrl.updateView();  // the call for update is given here
        System.out.println("");
        contrl.setStudentName("rehan");
        contrl.updateView();


    }
    private static student retriveStudentfromdatabase(){   //the function providing the data
        student student = new student();
        student.setName(" kaif");
        student.setRollno("1");
        return student;
    }
}
