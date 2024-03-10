package _02_nested_loops._3_for_loop_gauntlet;

public class loop {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i += 1) {
			for (int d = 0; d <3; d+=1) {
				System.out.println(String.valueOf(i)+String.valueOf(d));
			}
		}
	}
}
