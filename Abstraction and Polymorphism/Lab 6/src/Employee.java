public class Employee {
    private String fname;
    private String lname;

    public Employee(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    public String getfname () {
        return fname;
    }
    public String getLname () {
        return lname;
    }
    public void setlname (String lname) {
        this.lname = lname;
    }
    public void setfname (String fname) {
        this.fname = fname;
    }

    public String toString () {
        return "First Name: " + fname + "\n"
                + "Last Name: " + lname;
    }

    public  double earnings () {
        return 0;
    }
}
