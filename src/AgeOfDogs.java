public class AgeOfDogs {
    public static void main(String[] args) {
        int ageOfWinter = 3;
        int ageOfMax = 7;
        boolean sameAge = ageOfWinter == ageOfMax;
        boolean winterIsOlder = ageOfWinter > ageOfMax;
        boolean maxIsOlder = ageOfMax > ageOfWinter;
        System.out.println("원터의 나이가 맥스의 나이와 같은가? " + sameAge);
        System.out.println("원터의 나이가 맥스의 나이보다 많은가? " + winterIsOlder);
        System.out.println("맥스의 나이가 윈터의 나이보다 많은가? " + maxIsOlder);
    }
}
