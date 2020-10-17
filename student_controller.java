package mvc_demonstration;

/* this is the controller which handles all the controls in java*/
public class student_controller {
    private student model;
    private student_view view;
    public student_controller(student model, student_view view ){   //constructor
        this.model = model;  //intializing
        this.view = view;
    }
    public void setStudentName(String name){   //passing the name as a parameter
        model.setName(name);
    }
    public String getStudentName(){
        return model.getname();
    }
    public String getStudentRollno(){
        return model.getRollno();
    }
    public void updateView(){   //this function will update the string and the roll no
        view.printStudentDetails(model.getname() ,model.getRollno());
    }
}
