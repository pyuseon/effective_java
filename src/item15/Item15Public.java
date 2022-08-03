package item15;

class Item15Public {
    public static final Integer[] SOME_VALUES = {1, 2, 3};
}

class TestPublic {
    public static void main(String[] args) {
        System.out.println(Item15Public.SOME_VALUES[0]); // 1
        Item15Public.SOME_VALUES[0] = 5;
        System.out.println(Item15Public.SOME_VALUES[0]); // 5
    }
}


