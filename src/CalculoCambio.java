import java.util.Scanner;

public class CalculoCambio {

    String moedaDeOrigem;
    String moedaDeDestino;
    double valorMoedaDeOrigem;
    double valorCambioFinal;

    public static void obterDados() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Por favor digite o nome da moeda de origem: ");
        moedaDeOrigem = leitor.nextLine();
        
        System.out.println("Agora digite o valor da moeda: ");
        valorMoedaDeOrigem = leitor.nextDouble();

        System.out.println("Agora digite o nome da moeda de destino:  ");
        moedaDeDestino = leitor.nextLine();
        
        calcularCambio();
    }

    public static void calcularCambio() {
    
    valorCambioFinal = 1 / valorMoedaDeOrigem;
    
    exibirResultados();
    }
    
    public static  void exibirResultados(){
    
        System.out.println("***********************");
        System.out.println("MOEDA DE ORIGEM: " + moedaDeOrigem );
        System.out.println("PREÇO: " + valorMoedaDeOrigem );
        System.out.println("MOEDA DE DESTINO: " + moedaDeDestino );
        System.out.println("1  " + moedaDeDestino + "É IGUAL A: " + valorCambioFinal + moedaDeOrigem);
        System.out.println("***********************");
        
    }

}
