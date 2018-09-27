import java.util.HashSet;

public class SubsetHashing {
	
    /* Return true si Tab2 [] est un sous-ensemble de Tab1 [] */
	//inspire par: https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
    
    static boolean isSubsetHash(int tab1[], int tab2[], int m, int n)
    {
    	HashSet<Integer> hash_set = new HashSet<>();
    	// mettre les valeurs tab1 dans hash_set
    	for(int j = 0; j < m; j++) hash_set.add(tab1[j]);
    	
    	// Verifier si les valeurs de tab2 sont dans tab1
    	for (int k = 0; k < n; k++)
    	{
    		if (hash_set.contains(tab2[k]));
    		else return (false);
    	}
    	 return (true);
    }
     
 
    public static void main(String[] args) 
    { 
        int T1[] = {5, 11, 12, 1, 10, 3, 7};
        int T2[] = {11, 1, 10};
         
        int m = T1.length;
        int n = T2.length;
     
        if(isSubset(T1, T2, m, n))
            System.out.print("Tab2 [] est un sous-ensemble de Tab1 [] ");
        else
            System.out.print("Tab2 [] n'est pas un sous-ensemble de Tab1 []"); 
    }
}


