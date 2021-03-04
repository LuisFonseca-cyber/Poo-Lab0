import java.util.Scanner;
public class AppStart
{
      public static void main(String [] args){
        boolean validOption=false;
        Size size = null;
        Scanner sizeReader = new Scanner(System.in);
        System.out.println("Bem Vindo ao meu programa :) \nEste programa tem como objetivo correr um enumerado de tamanhos\nInsira por favor uma das opções que se econtram abaixo \n");
        while(validOption==false){
            System.out.println("*************Tamanhos disponiveis***********");
            System.out.println("*           Pequeno, Médio, Grande         *");
            System.out.println("********************************************");
            System.out.println("");
            System.out.println("Tamanho ->");
            String newSize = sizeReader.next();
            if (newSize.equalsIgnoreCase("Pequeno")){
                size = Size.SMALL;
                validOption=true;
            }else if(newSize.equalsIgnoreCase("Médio")){
                size = Size.MEDIUM;
                validOption=true;
            }else if(newSize.equalsIgnoreCase("Grande")){
                size = Size.LARGE;
                validOption=true;
            }else{
                System.out.println("Erro! Tamanho invalido por favor insira novamente");
                validOption=false;
            }
        }
        
        System.out.println("Name            :" +size.name());
        System.out.println("toString()      :" +size.toString());
        System.out.println("Ordem           :" +size.ordinal());
        System.out.println("Valor minimo    :" +size.getMinValue());
        System.out.println("Valor maximo    :" +size.getMaxValue());
        System.out.println("Codigo          :" +size.getCode());
      }
}
