public class BMICalculator {
    public static void main(String[] args) {
        double height = 1.73;
        double weight = 25.0;

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("저체중입니다.");
        } else if (bmi >= 23) {
            System.out.println("과제중입니다.");
        } else {
            System.out.println("정상체중입니다.");
        }
    }
}
