import java.util.Scanner;
import java.util.ArrayList;

public class Q1_capgemini {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size;
        int mediana;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Tamanho do Array: ");
            size = scanner.nextInt();
            scanner.nextLine();
            //Verifica se array é par
            if(size % 2 == 0){
                System.out.println("Error, array par!");
                System.exit(0); 
            }
            for(int i = 0; i < size; ++i){
                System.out.print("Valor da "+(i+1)+"a. posicao: ");
                arr.add(scanner.nextInt());
                scanner.nextLine();
            }
            //ordena array (ordem decrescente)
            for(int i = 0; i < size; ++i){
                for(int j = i+1; j < size; ++j){
                    if(arr.get(i) > arr.get(j)){
                        int aux = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, aux);
                    }
                }
            }
            mediana = size/2;
            for(int i = 0; i < size; ++i){
                if(arr.get(mediana) != null){
                    System.out.println("A mediana eh: "+arr.get(mediana));
                    System.exit(0);
                }
            }
        }
    }
}