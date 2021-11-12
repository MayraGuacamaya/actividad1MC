
package actividad1;
import java.util.Scanner;

public class Actividad1 {

  
    public static void main(String[] args) {
        
        Scanner ingreso;
        ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de registros");
        
        int a;
        a = ingreso.nextInt();
        
        int matriz[][];
        matriz = new int[a][3];
        
        for (int x=0; x<matriz.length;x++){
            
            int y = x+1;
            
            System.out.println("\n \n Registro No." + y + "\n Ingrese el código del producto: ");
            matriz[x][0]= ingreso.nextInt();
            System.out.println("Ingrese la cantidad existente del producto: ");
            matriz[x][1]=ingreso.nextInt();
            
            if (matriz[x][1]<20){
                matriz[x][2]=0;
                
            }else{
                matriz[x][2]=1;
            }
    
        }       
        
        System.out.println("\n \n ********************************************************");
        
        for (int x=0; x< matriz.length; x++){
            String estado = "";     
            
            if(matriz[x][2]==0){
                estado="Necesita abastecimiento";
            }
            
            if(matriz[x][2]==1){
                estado="Producto en bodega";
            } 
            
            System.out.println("\n Código del producto: " + matriz[x][0] + "\n cantidad: "+matriz[x][1] + "\n estado: "+ estado + "\n \n");
            
        }
    }
    
}
