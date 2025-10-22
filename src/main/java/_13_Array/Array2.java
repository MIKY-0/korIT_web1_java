package _13_Array;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        int origin[] = {1,2,3,4,5};
        int copy1[] = origin; // 얕은복사. -> 같은 메모리 주소를 힙에 저장.
        System.out.println(origin);// origin[] 주소값
        System.out.println(Arrays.toString(origin));

        //깊은복사
        int copy2[] = Arrays.copyOf(origin , 0);
        int copy3[] =  { };
        System.arraycopy(origin , 0 , copy3 , 0 , 0);
    }
}
