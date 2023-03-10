/*
1. Contar Caracteres Maiúsculos Iterativo
Crie um método iterativo em Java que receba como parâmetro uma string e
retorne o número de caracteres maiúsculos presentes nessa string. A entrada
padrão é composta por várias linhas sendo que a última apresenta apenas a
palavra FIM. A saída padrão contém um número inteiro para cada linha de
entrada.
*/
package verde01;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Verde01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String frase="";
        frase = input.nextLine();
        while (!frase.equals("FIM")){
            
            System.out.println(verificaMaiuscula(frase));
            frase = input.nextLine();
        }
        input.close();
    }
    
    public static int verificaMaiuscula(String s){
        int cont=0;
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                cont += 1;
            }
        }
        return cont;
    }
    
}
