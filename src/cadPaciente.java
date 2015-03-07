
import java.util.Scanner;


public class cadPaciente{

		Scanner ler = new Scanner(System.in);
		
	public Paciente cadastraPaciente(){

		Paciente paciente = new Paciente();

		System.out.println("### PACIENTE ###");
		System.out.println("");
		System.out.println("Nome: ");
		    paciente.setNome(ler.next());
		System.out.println("CPF: ");
		    paciente.setCpf(ler.next());
		System.out.println("Sexo: ");
		    paciente.setSexo(ler.next());
		System.out.println("Data de Nascimento: ");
		    paciente.setDataNascimento(ler.next());

		return paciente;
	}

}

