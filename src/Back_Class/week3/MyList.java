package Back_Class.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    int[] arr = new int[10000];
    int pointer = 0;

    public void append(int val) {
        this.arr[0] = val;
        this.pointer += 1;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        // 리스트의 기능 설계
        // .append()

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list2.add(1);


    }
}
