package ProjetoStart;

import java.util.Scanner;

public class Contato extends Aluno{
	
	private String mensagem;
    
    
	public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    static Scanner entrada = new Scanner(System.in);
    
    public void formContato() {
        //PREENCHENDO FORMULARIO DE CONTATO
                System.out.println("Digite seu nome: ");
                setNome(entrada.nextLine());
                System.out.println("Digite seu email: ");
                setEmail(entrada.nextLine());
                System.out.println("Digite o telefone: ");
                setTelefone(entrada.nextLine());
                System.out.println("Digite sua mensagem:");
                setMensagem(entrada.nextLine());
                System.out.println();
                System.out.println("OBRIGADO(A) PELO SEU CONTATO, EM BREVE RETORNAREMOS A SUA SOLICITAÇÃO.");
                Main.menuPrincipal();
    }
}

