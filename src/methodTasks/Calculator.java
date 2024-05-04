package methodTasks;

public class Calculator {
    double firstNum;
    double secNum;



    public Calculator(double firstNum, double secNum) {
        this.firstNum = firstNum;
        this.secNum = secNum;
    }

    public double Sum(double firstNum, double secNum) {

        return (firstNum + secNum);
    }

    public double Extract(double firstNum, double secNum) {

        return (firstNum - secNum);
    }

    public double Multiply(double firstNum, double secNum) {

        return (firstNum * secNum);
    }

    public double Division(double firstNum, double secNum) {

        return ( firstNum / secNum);
    }

    public double Remainder(double firstNum, double secNum) {

        return (firstNum % secNum);
    }
}
