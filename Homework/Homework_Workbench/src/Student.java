public class Student {

    private String name;
    private int midterm1;
    private int midterm2;
    private int midterm3;

    public Student(String name, int midterm1, int midterm2, 
    		int midterm3) {
        this.name = name;
        this.midterm1 = midterm1;
        this.midterm2 = midterm2;
        this.midterm3 = midterm3;
    }

    public char findGrade() {

        double avg = getAverage();

        if (avg >= 90.0) {
            return 'A';
        } else if (avg >= 80.0) {
            return 'B';
        } else if (avg >= 70.0) {
            return 'C';
        } else if (avg >= 40.0) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (midterm1 + midterm2 + midterm3) / 3.0;
    }

    public void setMidterm1(int midterm1) {
        this.midterm1 = midterm1;
    }

    public void setMidterm2(int midterm2) {
        this.midterm2 = midterm2;
    }

    public void setMidterm3(int midterm3) {
        this.midterm3 = midterm3;
    }
}

