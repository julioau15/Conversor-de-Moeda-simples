import java.util.Scanner;

public class CalculoCambio{

    String moedaDeOrigem;
    String moedaDeDestino;
    double cambioAtual;
    double valorCambioFinal;

    public void obterDados() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Por favor digite o nome da moeda de origem: ");
        moedaDeOrigem = leitor.nextLine();

        System.out.println("Agora digite o nome da moeda de destino:  ");
        moedaDeDestino = leitor.nextLine();

        System.out.println("Agora digite o cambio atual: ");
        cambioAtual = leitor.nextDouble();

        calcularCambio();
    }

    public void calcularCambio() {
    
      valorCambioFinal = 1.00 / cambioAtual;
    
      exibirResultados();
    }
    
    public void exibirResultados(){
    
        System.out.println("***********************");
        System.out.println("MOEDA DE ORIGEM: " + moedaDeOrigem );
        System.out.println("MOEDA DE DESTINO: " + moedaDeDestino );
        System.out.println("CAMBIO ATUAL: " + cambioAtual );
        System.out.println("1" + moedaDeDestino + " É IGUAL A: " + valorCambioFinal + moedaDeOrigem);
        System.out.println("***********************");
        
    }

}
