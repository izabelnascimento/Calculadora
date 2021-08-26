package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        float n1, n2, result;
        char op;
        Scanner entrada = new Scanner (System.in);
    
        System.out.println("Para você que diz que minha facul não serve de nada!!!!"
                + "Tome aí uma calculadora cirada by ME!");
    do{
        System.out.println("Digite a operação: ");
        System.out.println("+ -> Somar;");
        System.out.println("- -> Subtrair;");
        System.out.println("* -> Multiplicar;");
        System.out.println("/ -> Dividir;");
        System.out.println("@ -> Sair.");
        
        op = entrada.next().charAt(0);
        
        if(op!='@'){
            System.out.println("Digite um número: ");
            n1 = entrada.nextInt();
            System.out.println("Digite outro número: ");
            n2 = entrada.nextInt();
        }else{
            n1=0;
            n2=0;
        }
        
        switch(op){
            case '+':
                result=n1+n2;
                System.out.println("Resultado = " + result);
                break;
            case '-':
                result=n1-n2;
                System.out.println("Resultado = " + result);
                break;
            case '*':
                result=n1*n2;
                System.out.println("Resultado = " + result);
                break;
            case '/':
                if(n2==0){
                    System.out.println("Divisão inválida!");
                }else{
                    result=n1/n2;
                    System.out.println("Resultado = " + result);
                }
                break;
            case '@':
                System.out.println("Encerrando a calculadora.");
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }
            
    }while(op!='@');
    }
    
}
