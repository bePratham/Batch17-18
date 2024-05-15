package CustomArrayList;


public class Main {
    public static void main(String[] args) {

        WildCard<Float> list = new WildCard<>();
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
    }
}
