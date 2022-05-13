import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2{

    public static void main(String args[]){

        Scanner imput = new Scanner(System.in);
        int number=0, card, z=0, maxcard=0;

        List <Integer> mvalor = new ArrayList<>();
        List <Integer> mcard = new ArrayList<>();
    
        double valor, valortotal=0,maxval=0;
        String x;

        do{

            
            System.out.print(" Digite o numero da carteira, digite 0 para sair: ");
            card = imput.nextInt();
           
            if(card!=0){
                do{
                    number= number+1;
                    System.out.print("\n Digite o valor da multa: \n");
                    valor = imput.nextDouble();
                    valortotal= valortotal+valor;

                    System.out.print("\nDigite 'sim' mudar a carteira sendo multada: \n");
                    imput.nextLine();
                    x = imput.nextLine();
                
                    if(x.equals("sim")){
                        mvalor.add(number);
                        System.out.print("\nO dono da carteira "+ card+" recebeu " +number+ " multas, com um total de R$"+ valortotal+ "\n\n");
                    }

                }while(!x.equals("sim")); 
            }//programa trava quando digito "0" para o valor de card, não sei se o error está na minha maquina, funciona normal se remover o if, porem a ausencia do if causaria leitura uma desnecessária dentro do do{}while 

          
            number=0;
            valor=0;
            mcard.add(card);
    
        }while(card!=0);
       
        while(z<mcard.size()){
            if(maxval<mvalor.get(z)){
                maxval=mvalor.get(z);
                maxcard=mvalor.get(z);
            }
        }
        System.out.print("a carteira que levou mais multas foi: "+maxcard+" com um total de "+ maxval+ "multas");
        
        imput.close();
    }
}
