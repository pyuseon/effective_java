package item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Item15Private {
    // 길이가 0이 아닌 배열은 모두 변경 가능하다.
    // 외부에서 접근하여 배열 변경이 불가능ㅎ ㅏ게 하기 위해선 private 접근지정자로 설정해야 하낟.
    private static final Integer[] SOME_VALUES = {1, 2, 3};
    // 변경 불가능한
    public static final List<Integer> VALUES = Collections.unmodifiableList(Arrays.asList(SOME_VALUES));
//

}

class TestPrivate{
    public static void main(String[] args) {
        System.out.println(Item15Private.VALUES.get(0)); // 1
        //Item15Private.VALUES.set(0, 5); 변경 불가한 리스트이기 떄문에 외부에서 변경이 불가하가.
        System.out.println(Item15Private.VALUES.get(0)); // 5
    }
}
