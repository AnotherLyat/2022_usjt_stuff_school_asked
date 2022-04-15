import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3{

    public static void main(String args[]){

        Scanner imput = new Scanner(System.in);
        int num=0, qt=0;
        double per=0, CCount=0, SCount=0, VCount=0, DCount=0,inval=0, med=0, ages=0;
        String stat;

        List <Double> age = new ArrayList<>();
        List <String> status = new ArrayList<>();

        do{
            
            System.out.print("\nDigite a idade, digite 0 para sair: ");
            ages = imput.nextInt();

            if(ages!=0){
                age.add(ages);
                
                System.out.print("Digite o estado Civil \r  C - Casado, S - Solteiro, V - Viúvo e D - Desquitado\r");
                stat = imput.nextLine();
                status.add(stat);

                if(stat.equals("C")||stat.equals("casado")||stat.equals("Casado")){
                    CCount=CCount+1;
                }

                else if(stat.equals("S")||stat.equals("solteiro")||stat.equals("Solteiro")){
                    SCount=SCount+1;
                }

                else if(stat.equals("V")||stat.equals("Viuvo")||stat.equals("viuvo")){
                    VCount=VCount+1;
                }

                else if(stat.equals("D")||stat.equals("Desquitado")||stat.equals("desquitado")){
                    DCount=DCount+1;
                }
                else{
                    System.out.print("Entrada invalida");
                    inval=inval+1;
                }
            }

            num=num+1;
        }while(ages!=0);

        System.out.print("\nHá "+CCount+" pessoas casadas e "+SCount+" pessoas solteiras\n");
        per= ((DCount+VCount)/(CCount+SCount+VCount+DCount+inval))*100;
        System.out.print(per+"% das pessoas analisadas são dequitadas or viúvas\n");

        while(num<age.size()){
            if(status.get(num).equals("V")){
                med=med+age.get(num);
                qt=qt+1;
            }
            num=num+1;
        }
        med=med/qt;
        System.out.print("A média da idade das pessoas viúvas é: "+med);
        
        imput.close();
    }
}
