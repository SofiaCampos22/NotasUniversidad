package parcial1;
import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4, aux, aux1;
        int CA[] = new int[n];
        int NO[] = new int[n];
        char op;
        
        do{    
        System.out.println("---INGRESO DE DATOS---");
        for(int i=0;i<n;i++){
            System.out.println("Ingrese Carné " +(i+1)+ ":\t");
            CA[i] = sc.nextInt();
            System.out.println("Ingrese Nota " +(i+1)+ ":\t");
            NO[i] = sc.nextInt();
        }
        
       for(int i=0;i<(n-1);i++){
           for(int j=0;j<(n-1);j++){
               if(NO[j]>NO[j+1]){
                   aux = NO[j];
                   NO[j] = NO[j+1];
                   NO[j+1] = aux;
                   aux1 = CA[j];
                   CA[j] = CA[j+1];
                   CA[j+1] = aux1;
               }
           }
       }
        
       System.out.println("Las Notas ordenadas son: ");
       for(int i=0;i<n;i++){
           System.out.println((i+1)+ ". " +CA[i]+ ", " +NO[i]);
       }
       System.out.println("¿Desea repetir el proceso? s/n");
       op = sc.next().charAt(0);
       
    }while(op=='S' || op=='s');
        }
}