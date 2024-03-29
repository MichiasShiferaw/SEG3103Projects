//package TestDemo;
//
//import org.openjdk.jmh.annotations.*;
//import org.openjdk.jmh.infra.Blackhole;
//import org.openjdk.jmh.runner.Runner;
//import org.openjdk.jmh.runner.RunnerException;
//import org.openjdk.jmh.runner.options.Options;
//import org.openjdk.jmh.runner.options.OptionsBuilder;
//
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//@State(Scope.Benchmark)
//@OutputTimeUnit(TimeUnit.MICROSECONDS)
//public class ArrayBenchmark {
//    @Param({"1000","20000"})
//    int length;
//
//    int[] intArray;
//    Integer[] integerArray;
//    @Setup(Level.Trial)
//    public void setup(){
//        intArray = new int [length];
//        integerArray = new Integer[length];
//
//        final Random random = new Random();
//        for (int i=0; i< length; i++){
//            final int value = random.nextInt();
//            intArray[i]=value;
//            integerArray[i]=value;
//
//        }
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void intArray(Blackhole bh){
//        for(int i=0;i<intArray.length;i++){
//            bh.consume(intArray[i]);
//        }
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void integerArray(Blackhole bh){
//        for(int i=0;i<integerArray.length;i++){
//            bh.consume(integerArray[i]);
//        }
//    }
//
//    public static void main(String... args) throws RunnerException{
//        Options opts = new OptionsBuilder()
//                .include("SEGTest12")
//                .warmupIterations(1)
//                .measurementIterations(1)
//                .jvmArgs("-Xms2g","-Xmx2g")
//                .shouldDoGC(true)
//                .forks(1)
//                .build();
//        new Runner(opts).run();
//    }
//}
