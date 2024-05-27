public class Output {
    public String printSum(double num1, double num2) {
        Sum getSumDetails = new Sum();

        double resultSum = getSumDetails.sumOf(num1, num2);

        return "The sum is " + resultSum;
    }

    public String printDifference(double num1, double num2) {
        Difference getDifferenceDetails = new Difference();

        double resultDifference = getDifferenceDetails.differenceOf(num1, num2);

        return "The difference is " + resultDifference;

    }

    public String printMultiplication(double num1, double num2) {

        Multiply getMultiplyDetails = new Multiply();

        double resultMultiply = getMultiplyDetails.multiplyOf(num1, num2);

        return "The multiplication is " + resultMultiply;

    }

    public String printDivision(double num1, double num2) {
        Division getDivisionDetails = new Division();

        double resultDivision = getDivisionDetails.divisionOf(num1, num2);

        return "The Division is " + resultDivision;
    }
}
