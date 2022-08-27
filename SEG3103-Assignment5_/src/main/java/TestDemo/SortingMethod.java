//package TestDemo;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SortingMethod {
//    private final float[] values;
//    public static final float LEFT_LIMIT = -272F;
//    public static final float RIGHT_LIMIT = 499;
//
//    public SortingMethod(float[] values) {
//        this.values = values.clone();
//    }
//
//    public List<Float> collectionSort() {
//        List<Float> sortList = new ArrayList<>();
//
//        for (Float it : values) {
//            sortList.add(it);
//        }
//
//        Collections.sort(sortList);
//        return sortList;
//    }
//
//
//    public List<Float> selectionSort() {
//        List<Float> sortList = new ArrayList<>();
//        int temp;
//        for (Float it : values) {
//            sortList.add(it);
//        }
//
//        for (int i = 0; i < sortList.size() - 1; i++) {
//            int index = i;
//            for (int j = i + 1; j < sortList.size(); j++)
//                if (sortList.get(j) < sortList.get(index))
//                    index = j;
//
//            float smallerNumber = sortList.get(index);
//            sortList.set(index, sortList.get(i));
//            sortList.set(i, smallerNumber);
//        }
//        return sortList;
//    }
//
//    public List<Float> insertionSort() {
//        List<Float> sortList = new ArrayList<>();
//        int temp;
//        for (Float it : values) {
//            sortList.add(it);
//        }
//
//        for (int i = 0; i < sortList.size() - 1; i++) {
//            int index = i;
//            for (int j = i + 1; j < sortList.size(); j++)
//                if (sortList.get(j) < sortList.get(index))
//                    index = j;
//
//            float smallerNumber = sortList.get(index);
//            sortList.set(index, sortList.get(i));
//            sortList.set(i, smallerNumber);
//        }
//        return sortList;
//    }
//
//    public List<Float> bubbleSort() {
//        List<Float> sortList = new ArrayList<>();
//
//        boolean chek = false;
//        while (!chek) {
//            chek = true;
//            for (int i = 0; i < values.length - 1; i++) {
//                if (values[i] > values[i + 1]) {
//                    chek = false;
//
//                    float buff = values[i];
//                    values[i] = values[i + 1];
//                    values[i + 1] = buff;
//                }
//            }
//        }
//
//        for (Float it : values) {
//            sortList.add(it);
//        }
//
//        return sortList;
//    }
//
//
//}