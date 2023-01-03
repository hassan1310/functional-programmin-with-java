package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Apple","Blackberry","Banana","Mango");
		Predicate<? super String> predicate=fruit->fruit.startsWith("B");
		Optional<String> findFirst = fruits.stream().filter(predicate).findFirst();
		System.out.println(findFirst);
		System.out.println(findFirst.isEmpty());
		System.out.println(findFirst.isPresent());
		System.out.println(findFirst.get());
	}

}
