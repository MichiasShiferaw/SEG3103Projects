//package TestDemo;
//
//import org.openjdk.jmh.annotations.*;
//import org.openjdk.jmh.infra.Blackhole;
//
//import java.util.List;
//import java.util.Random;
//
//
//@Fork(value = 1)
//@Warmup(iterations = 3)
//@Measurement(iterations = 3, time =2)
//@State(Scope.Benchmark)
//public class SortingMain {
//
//    private final int size = 60000;
//    private static float[] val;
//    public static final float LEFT_LIMIT = -1000;
//    public static final float RIGHT_LIMIT = 1000;
//
//    public SortingMethod setup() {
//        val = new float[size];
//        float generatedFloat;
//        int randomNum;
//        for (int i = 0; i < val.length; i++) {
//            generatedFloat = (float) Math.ceil(LEFT_LIMIT + new Random().nextFloat() * (RIGHT_LIMIT - LEFT_LIMIT));
//            randomNum = (int) (Math.random() * 9);
//            val[i] = (float) (generatedFloat + (randomNum / 10.));
//        }
//        return new SortingMethod(val);
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.All)
//    public void collectionSort(Blackhole bh) {
//        List<Float> result = setup().collectionSort();
//        bh.consume(result);
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.All)
//    public void insertionSort(Blackhole bh) {
//        List<Float> result = setup().insertionSort();
//        bh.consume(result);
//    }
//    @Benchmark
//    @BenchmarkMode(Mode.All)
//    public void selectionSort(Blackhole bh) {
//        List<Float> result = setup().selectionSort();
//        bh.consume(result);
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.All)
//    public void bubbleSort(Blackhole bh) {
//        List<Float> result = setup().bubbleSort();
//        bh.consume(result);
//    }
//
//}
//
