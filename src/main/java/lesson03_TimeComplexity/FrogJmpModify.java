package lesson03_TimeComplexity;

public class FrogJmpModify {
	public static void main(String[] args) {
		int X = 10;
		int Y = 85;
		int D = 30;
		
		System.out.println(solution(X, Y, D));
	}
	
	public static int solution(int X, int Y, int D) {
		return (int) Math.ceil((Y-X) / (double)D);
	}
}
