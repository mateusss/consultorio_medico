
import java.util.Scanner;


public class cadPaciente{

		Scanner ler = new Scanner(System.in);
		
	public Paciente cadastraPaciente(){

		Paciente paciente = new Paciente();

		System.out.println("### PACIENTE ###");
		System.out.println("");
		    paciente.setNome(Console.lerString("Nome: "));
		    paciente.setCpf(Console.lerString("CPF: "));
		    paciente.setSexo(Console.lerString("Sexo: "));
		    paciente.setDataNascimento(Console.lerString("Data Nascimento: "));

		return paciente;
	}

}

