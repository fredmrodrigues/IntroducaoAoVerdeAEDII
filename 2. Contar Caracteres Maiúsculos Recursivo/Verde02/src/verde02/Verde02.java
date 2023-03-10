/*
2. Contar Caracteres Maiúsculos Recursivo
Crie um método recursivo em Java que receba como parâmetro uma string e
retorne o número de caracteres maiúsculos presentes nessa string. A entrada
padrão é composta por várias linhas sendo que a última apresenta apenas a
palavra FIM. A saída padrão contém um número inteiro para cada linha de
entrada.
*/
package verde02;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Verde02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String frase="";
        frase = input.nextLine();
        while (!frase.equals("FIM")){
            System.out.println(verificaMaiuscula(0, 0, frase));
            frase = input.nextLine();
        }
        input.close();
    }
    
    public static int verificaMaiuscula(int cont, int pos, String s){
        if (pos < s.length()){
            if (Character.isUpperCase(s.charAt(pos))){
                cont += 1;
            }
            return verificaMaiuscula(cont, (pos + 1), s);
        }
        else
            return cont;
    }
}
