import java.util.Scanner;

public class Q3_capgemini {
    public static void main(String[] arg){
        String str;
        double rows,cols;
        char[] charArr;
        int cont = 0;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Entre com uma frase: ");
            str = scanner.nextLine();
            str = str.replace(" ", "");
            charArr = str.toCharArray();
            rows = Math.round(Math.sqrt(str.length()));
            cols = rows;
            //certifica que linhas/colunas >= tamanho da string
            if((rows*cols) < str.length()){
                System.out.println("Linhas/colunas menor que o tamanho da string!");
                System.exit(0);
            }
            //typecasting rows && cols
            int row = (int) rows;
            int col = (int) cols;
            Character[][] grid = new Character[row][col];
            //dispõe a mensagem num grid (matriz)
            for(int r = 0; r < rows; ++r){
                for(int c = 0; c < cols; ++c){
                    if(cont == str.length()){
                        break;
                    }
                    grid[r][c] = charArr[cont];
                    ++cont;
                }
            }
            //organiza mensagem criptografada
            for(int c = 0; c < cols; ++c){
                for(int r = 0; r < rows; ++r){
                    if(grid[r][c]!=null){
                        System.out.print(grid[r][c]);
                    }
                }
                System.out.print(" ");
            }
        }
    }
}