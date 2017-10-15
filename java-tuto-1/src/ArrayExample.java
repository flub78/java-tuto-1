/**
 * Some examples on java arrays
 * @author fpeignot
 *
 */
public class ArrayExample {

	public static void main(String[] args) {
		System.out.println("Some examples on java arrays.");
		
		int nbs[][] = { {0,2,4,6,8},{1,3,5,7,9} };
		System.out.println(nbs.toString());
		
		for (int line[] : nbs) {
			int n = 0;
			for (int i : line) {
				System.out.print(i);
				n++;
				if (n < line.length)
					System.out.print(", ");
			}
			System.out.println("");
		}

		String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		int i = 0, j = 0;
		 
		for(String sousTab[] : tab)
		{
		  i = 0;
		  for(String str : sousTab)
		  {     
		    System.out.println("La valeur de la nouvelle boucle est  : " + str);
		    System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
		    i++;
		  }
		  j++;
		}
		
		System.out.println("Bye.");
	}

}
