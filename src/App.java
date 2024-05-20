import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone("iPhone 13", "ABC123456", "iOS 15");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("4. Fazer chamada");
            System.out.println("5. Atender chamada");
            System.out.println("6. Iniciar correio de voz");
            System.out.println("7. Exibir página da web");
            System.out.println("8. Adicionar nova aba");
            System.out.println("9. Atualizar página");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    iphone.getReprodutorMusical().tocar();
                    break;
                case 2:
                    iphone.getReprodutorMusical().pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.getReprodutorMusical().selecionarMusica(musica);
                    break;
                case 4:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    iphone.fazerChamada(numero);
                    break;
                case 5:
                    iphone.getAparelhoTelefonico().atender();
                    break;
                case 6:
                    iphone.getAparelhoTelefonico().iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL da página: ");
                    String url = scanner.nextLine();
                    iphone.abrirPagina(url);
                    break;
                case 8:
                    iphone.getNavegadorInternet().adicionarNovaAba();
                    break;
                case 9:
                    iphone.getNavegadorInternet().atualizarPagina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}