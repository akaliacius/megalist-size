import java.util.ArrayList;

public class megalist {
	public static void main(String[] args) {
		var list = new ArrayList<Long>(1_000_000_001);

		for (long i = 0L; i < 1_000_000_000; i++) {
			list.add(i);
		}

		System.out.println(list.size());
	}
}
