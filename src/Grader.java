public class Grader {
    public char grader(int grade){
        if (grade< 0 || grade > 100){

            throw new IllegalArgumentException("The grade cannot be less than 0 or greater than 10");
        }
        else if (grade < 60){
            return 'F';
        }
        else if (grade < 70){
            return 'D';
        }
        else if (grade < 80){
            return 'C';
        }
        else if (grade < 90){
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
