
public class L04_Q03 {
	public static void main(String[] args) {
		int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] B = new int[15];
		int i;
		for (i = 0; i < A.length; i++) {
			B[i] = A[i] * A[i];
			System.out.println("Posição " + i + ": Elemento de A = " + A[i] + ", Elemento de B = " + B[i]);
		}
	}
}
