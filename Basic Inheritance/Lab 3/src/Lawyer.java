public class Lawyer extends Employee {

    @Override
    public int getVacdays() {
         return super.getVacdays()+5;
    }

    public String getForm() {
        return "Pink";
    }
    public String sue () {
        System.out.println( "I will see you in court.");
        return null;
    }


}
