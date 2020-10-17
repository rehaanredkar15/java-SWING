package mvc_demonstration;

public class student {

    /* this is the model of the mvc and this contains the data of the student  */
    private String rollno;
    private String name;  //variables are private so we use getters and setters

    public String getRollno() {  //getter and setters are used here for achieving encapsulation
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String  getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
