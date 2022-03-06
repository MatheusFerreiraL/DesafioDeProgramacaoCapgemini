import java.util.Scanner;
import java.util.ArrayList;

public class Q2_capgemini {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x, size, cont = 0;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Valor de 'x': ");
            x = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Informe o tamanho do array: ");
            size = scanner.nextInt();
            for(int i = 0; i < size; ++i){
                System.out.print("Valor da "+(i+1)+"a. posicao: ");
                arr.add(scanner.nextInt());
            }
            //organiza o array em ordem decrescente 
            for(int i = 0; i < size; ++i){
                for(int j = i+1; j < size; ++j){
                    if(arr.get(i) < arr.get(j)){
                        int aux = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, aux);
                    }
                }
            }
            //verifica os casos de elementos pares com diferença == x
            for(int i = 0; i < size; ++i){
                for(int j = i+1; j < size; ++j){
                    if(arr.get(i) - arr.get(j) == x){
                        System.out.println(arr.get(i) + " e " + arr.get(j));
                        ++cont;
                    }
                }
            }
            System.out.println("Total de pares: " + cont);
        }
    }
}