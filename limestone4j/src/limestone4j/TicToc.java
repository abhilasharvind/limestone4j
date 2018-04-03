package limestone4j;

public class TicToc {
	static long startTime;
	static long endTime;

	public static void tic() {
		startTime = System.nanoTime();
	}

	public static void toc() {
		endTime = System.nanoTime();
	}

	public static void getEllapsedTIme() {
		long x = endTime - startTime;
		double seconds = (double) x / 1000000000.0;
		System.out.println(String.format("%s seconds", seconds));
	}

}
