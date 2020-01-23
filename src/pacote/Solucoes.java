package pacote;

public class Solucoes {	
	
    public int solutionArray(int[] A) {
        int res = 0;
        for(int percorredorArray : A){
            res ^= percorredorArray;
        }
        return res;
    }

    public int solutionDistinct(int A []) {
    	int res = 0;
		for(int percorredor = 0; percorredor<A.length; percorredor++){
            int verificador;
			for (verificador = 0; verificador < percorredor; verificador++) {
               if (A[percorredor] == A[verificador]) {
            	   break;
               }
            }
            if (percorredor == verificador){
                res++;
            }
        }
        return res;
    }
    
    public int solutionEuclidean(int N, int M) {
        int[] X = new int[N];
        int chocolate = 0;
        int count = 0;
        while(X[chocolate] == 0) {
            X[chocolate] = 1;
            chocolate = (chocolate + M) % N;
            count++;
        }
        return count;
    }
}
