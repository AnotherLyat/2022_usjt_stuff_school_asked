import java.util.Scanner;

public class CalculadoraCientifica{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alt;
        double a, b, res;
        calculo cal = new calculo();
        
        System.out.print("digite 'pot' para fazer potencia, digite 'rad' para fazer radiciação ");
        alt = input.next();

        System.out.print("valor da base = ");
        a= input.nextDouble();

        System.out.print("valor do secundario = ");
        b= input.nextDouble();

        if (alt.equals("pot")){
            res= cal.pot(a, b);
        }
        else if (alt.equals("rad")){
            res = cal.rad(a, b);
        }
        else{
            System.out.print("algo errado aconteceu, tente novamente");
        }

        input.close();
    }    
}
