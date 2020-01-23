package pacote;

public class App {
	 public static void main(String[] args){
	        Solucoes solution = new Solucoes();
	        int[] array = {3,3,9,9,5}; 
	        System.out.println("Solução do primeiro teste: " + solution.solutionArray(array) + " é o numero não pareado.");
	        System.out.println("Solução do segundo teste: " +solution.solutionDistinct(array) + " numeros distintos.");
	        System.out.println("Solução do terceiro teste: " +solution.solutionEuclidean(10, 4) + " chocolates.");
	    }
}