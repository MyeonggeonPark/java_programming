public class String05 {
    public static void main(String[] args) {
        String fat = "치킨은 살 안 쨔요. 살은 내가 쩌요.";
        String replaced = fat.replaceAll("내가", "네가");
        System.out.println(replaced);
    }
}
