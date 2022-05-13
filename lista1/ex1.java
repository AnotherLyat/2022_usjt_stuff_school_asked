import java.util.Scanner;

public class Ex1{

    public static void main(String args[]){
        String leave;
        int age, ExA=0, number=0;
        double height, avheight=0, weight, nweight=0, ExC=0;
        Scanner imput = new Scanner(System.in);
        do{
            

            System.out.println("Digite a idade do individuo: ");
            age = imput.nextInt();

            if (age>50){
                ExA=ExA+1;
            }

            System.out.println("Digite a altura do individuo: ");
            height = imput.nextDouble();
            if (age>=10 && age<=20){
                avheight = avheight + height;
            }

            System.out.println("Digite o peso do individuo: ");
            weight = imput.nextDouble();
            if (weight < 40){
                nweight = nweight+1;
            }

            number=number+1;

            System.out.println("se você quiser sair digite 'yes': ");
            imput.nextLine();
            leave = imput.nextLine();

        }while (!leave.equals("yes"));
        
        System.out.print("há "+ ExA+ " pessoas mais velhas que 50 anos \n");
        
        avheight= avheight/number;
        System.out.printf("A média de altura entre as pessoas com 10 a 20 anos é: "+ avheight + "\n");
        
        ExC=(nweight/number)*100;
        System.out.print( ExC+ "% das pessoas pesam menos ques 40 quilos \n\n");

        imput.close();
        
    }
 
}
