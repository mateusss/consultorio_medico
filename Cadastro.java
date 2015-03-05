import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	ArrayList<Paciente> pacientes;
	ArrayList<Medicamento> medicamentos;
	Paciente paciente;
	Medicamento medicamento;
	Scanner ler = new Scanner(System.in);

	int option=-1;

	public void menuDeCadastros() {

		do {
			System.out.println("CADASTRO");
			
			System.out.println("1 - Paciente");
			System.out.println("2 - Medicamento");
			System.out.println("0 - Sair");
			option = ler.nextInt();

			switch(option){
			
				case 1:{
					cadastraPaciente();
					break;
				}
				case 2:{
					cadastraMedicamento();
					break;
				}
				case 0:{
					System.out.println("Saindo...");
					break;
				}
				default:
					System.out.println("Opção Inválida!!");
			}		
		} while (option != 0);

	}

	public void cadastraPaciente(){

		Paciente paciente = new Paciente();
		
		//pacientes = new ArrayList<Paciente>();

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

		pacientes.add(paciente);
		
	}

	public void cadastraMedicamento() {

		Medicamento medicamento = new Medicamento();

		//medicamentos = new ArrayList<Medicamento>();
		
		System.out.println("### MEDICAMENTO ###");
		System.out.println("");
		System.out.println("Cod Medicamento: ");
		medicamento.setCod(ler.next());
		System.out.println("Nome: ");
		medicamento.setNomeComercial(ler.next());
		System.out.println("Concentração: ");
		medicamento.setConcentracao(ler.next());
		System.out.println("Tipo: ");
		medicamento.setTipo(ler.next());

		medicamentos.add(medicamento);
		
	}
	
	public void listarPacientes(){
		
		
		
	}
	
	public void listarMedicamentos(){
		
		
		
		
	}
}
