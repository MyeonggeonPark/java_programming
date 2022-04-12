import java.util.ArrayList;

public class CollectionSize {
    public static void main(String[] args) {
        ArrayList<String> videos = new ArrayList<>();

        videos.add("고양이의 보은");
        videos.add("원령공주");
        videos.add("붉은 돼지");

        System.out.println("총 " + videos.size() + "개의 동영상이 있습니다.");
    }
}
