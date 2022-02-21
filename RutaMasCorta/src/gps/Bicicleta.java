package gps;
/**
 * Bicicleta class
 * 
 * @Java IES Severo Ochoa
 * @2.0
 */

public class Bicicleta {
    public Bicicleta(){
        int ruedas = 4;
        boolean luces = false;
        String marca = "Orbea";
    }
    
    public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
    {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
/*********** APORTACION AL CODIGO PARA SOLUCIONAR EL FALLO ****************/
        int c1 = camino1.length;
        int c2 = camino2.length;
        int c3 = camino3.length;
        int cmax = 0;
        
        		if (c1<c2 && c3<c2) {
        			cmax=c2;
        		}else if (c2<c3 && c1<c3) {
        			cmax=c3;
        		}else {
        			cmax =c1;
        		}
       
        		int j = 0;
            	int r = 0; 
            	int p = 0;
            	
            	for(int i=0; i<=cmax; i++) {
                    
                    if (j<=c1-1) {
            		sum1 += camino1[j];
            		 j++;
                    }
                    if	(r<=c2-1) {
            		sum2 += camino2[r];
            		 r++;
                    }
                    if (p<=c3-1) {
            		sum3 += camino3[p];
            		 p++;
                    }
                }
                
 /**************************************************************************/          	
            	

        if(sum1 < sum2 && sum1 < sum3)
        {
            return "camino 1"; 
        }else if(sum2 < sum3 && sum2 < sum1)
        {
            return "camino 2";
        }else if(sum3 < sum1 && sum3 < sum2)
        {
            return "camino 3";
        }else{
            if(sum1 == sum2 && sum2 == sum3)
            {
                return "camino 1, 2 y 3";
            }else if(sum1 == sum3)
            {
                return "caminos 1 y 3";
            }else if(sum2 == sum3){
                return "caminos 2 y 3";
            }else{
                return "caminos 1 y 2";
            }
        }
        
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        int[] camino1 = {12,34,21,46,25};
        int[] camino2 = {24,1,5,64,10,15,21};
        int[] camino3 = {1,5,6,7,8,10,20,46,104};
        System.out.println("El camino más corto es:"+Bicicleta.rutaCorta(camino1,camino2,camino3)+".");
    }
}

