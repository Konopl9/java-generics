package com.mishcma.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(3);
        nums.add(6);
        nums.add(3);
        nums.add(2);
        nums.add(16);

        // rotate
        Collections.rotate(nums, 2);
        System.out.println();

        // we can reverse tge order
        Collections.reverse(nums);
        System.out.println(nums);

        // min and max
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));

        // shuffle
        Collections.shuffle(nums);
        System.out.println(nums);

        // replace the item
        Collections.replaceAll(nums, 1, 10);
        System.out.println(nums);





    }
}
