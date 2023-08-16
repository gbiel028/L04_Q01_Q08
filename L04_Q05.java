
public class L04_Q04 {
	public static void main(String[] args) {
		int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int[] B = new int[8];
		int i;
		for ( i = 0; i < A.length; i++) {
			B[i] = A[i] * 2;
			System.out.println("Posição " + i + ": Elemento de A = " + A[i] + ", Elemento de B = " + B[i]);
		}
	}
}
