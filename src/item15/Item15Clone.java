package item15;

public class Item15Clone {
    private static final Integer[] SOME_VALUES = {1, 2, 3};
    public static final Integer[] values() {
        return SOME_VALUES.clone();
    }
}

class TestClone {
    public static void main(String[] args) {
        System.out.println(Item15Clone.values()[0]); // 1
        Integer[] values2 = Item15Clone.values();
        values2[0] = 5; //클론 된 배열을 바꾸는 것은 가능하나 직접 원 배열을 변경할 수는 없다.
        System.out.println(values2[0]); // 1
    }
}