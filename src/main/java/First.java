
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class First {

	public static void main(String[] args) {

		List<String> list = List.of("One", "Two", "Three");
		Stream<String> stream = list.stream();
		System.out.println(stream.collect(Collectors.toSet()));

		String[] array = { "One", "Two", "Three" };
		Stream<String> stream2 = Arrays.stream(array);
		System.out.println(stream2.collect(Collectors.toList()));

		Stream<String> stream3 = Stream.of("One", "Two", "Three");
		System.out.println(stream3.collect(Collectors.toList()));

		Stream<List<String>> generate = Stream.generate(() -> list);
		System.out.print(generate.collect(Collectors.toList()));

		Builder<String> builder = Stream.builder();
		Stream<String> build = builder.add("ok").add("ok").add("op").build();
		System.out.println(build.collect(Collectors.toList()));

		Stream<String> empty = Stream.empty();
		System.out.println(empty.findFirst());
	}
}
