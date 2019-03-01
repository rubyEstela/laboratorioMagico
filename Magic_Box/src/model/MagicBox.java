package model;

public class MagicBox {

	
	public static void main (String[] args) {
		
		int n =5;
		int i_ant=0;
		int j_ant=0;
		int punto_ini=n/2;
		int[][] magicMatrix=new int [n][n];
		int temp=5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				magicMatrix[i][j]=0;
			}
		
		}
	      int i =0;
	      int j=punto_ini;
	      
	      while(temp!=(n*n)+1) {
	    	  if(magicMatrix[i][j]==0) {
	    		  magicMatrix[i][j]=temp;
	    	  }else {
	    		  i=i_ant+1;
	    		  j= j_ant;
	    		  magicMatrix[i][j]=temp;
	    	 
	    	  }
	           i_ant=i;
	           j_ant=j;
	           temp++;
	           j++;
	           i--;
	           if(i<0 && j==n) {
	        	   i=n-1;
	        	   j=0;
	           }else if(i<0) {
	        	   i=i+n;
	           }else if (j==n) {
	        	   j=0;
	           }
	      }      
	    for(int x=0;x<n;x++) {
	    	String resultado="";
	    	for(int y=0;y<n;y++) {
	    		resultado=resultado + " " +magicMatrix[x][y];
	    	}
 	         System.out.println(""+resultado);
	    }    
	}   
	public int sumaTotal1() {
        int n = 0;
		int sum = n*(n*n + 1)/2;
        return sum;
    }
	public boolean sumanFila() {
        boolean cumpleSuma = true;
        int sumaFila = 0;
        int constanteMagica = sumaTotal1();
        int n = 0;
        
		while (n < n && cumpleSuma) {
            int[][] cuadro = null;
			int f = 0;
			for (int c = 0; c < n; c++)
                sumaFila += cuadro[f][c];

            if (sumaFila != constanteMagica) {
                cumpleSuma = false;
            }
            f++;
            sumaFila = 0;
        }
        return cumpleSuma;
}
	public boolean sumanColumna() {
        boolean cumpleSuma = true;
        int sumaColumna = 0;
        int constanteMagica = sumaTotal1();
        int c = 0;
        int n = 0;
		while (c < n && cumpleSuma) {
            int[][] cuadro = null;
			for (int f = 0; f < n; f++)
                sumaColumna += cuadro[f][c];

            if (sumaColumna != constanteMagica) {
                cumpleSuma = false;
            }
            c++;
            sumaColumna = 0;
        }
        return cumpleSuma;
        
    }

	
	
	

}

