package Java8Quns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;


public class SampleMaxLength {

	public static void main(String args[] ) {
		String sname = "programming";
		Map<Boolean, List<Entry<String, Long>>> map = Arrays.stream(sname.split("")).map(s -> s.toString()).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
				entrySet().stream().collect(Collectors.partitioningBy(x -> x.getValue()> 1));
		
		System.out.println(map.get(true));
		
		
		
	}
}
