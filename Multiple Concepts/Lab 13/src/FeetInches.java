public class FeetInches {
    int feet;
    int inches;

    public FeetInches() {
        this.feet = 0;
        this.inches = 0;
    }

    public FeetInches(int Feet, int inches) {
        this.feet = Feet;
        simplify(inches);

    }

    public FeetInches(FeetInches obj) {
        this.feet = obj.feet;
        this.inches = obj.inches;
    }

    public void simplify(int inches) {
        while (inches>=12) {
            inches-= 12;
            this.feet = feet + 1;
        }
        this.inches = inches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
            simplify(inches);
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public String toString() {
        return feet + "feet" + " " + inches + "inches";
    }

    public FeetInches add (FeetInches obj) {
        FeetInches a = this;
        a.inches += obj.inches;
        a.feet += obj.feet;
        simplify(a.inches);
        return a;
    }

    public boolean equals (FeetInches obj) {
        return ((obj.inches==this.inches) && (obj.feet==this.feet));
    }
}
