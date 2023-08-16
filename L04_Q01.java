
public class L04_Q01 {

	public static void main(String[] args) {
	      int[] A = {1, 2, 3, 4, 5};
	        int[] B = new int[A.length];
	        int i;

	        for (i = 0; i < A.length; i++) {
	            B[i] = A[i];
	            System.out.println("Posição " + i + " - Elemento de B: " + B[i]);
	        }
	}

}
