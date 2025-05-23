import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1, 5).toArray();
        System.out.println("Stored Elements:");
        Arrays.stream(array).forEach(System.out::println);
    }
}
