import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	ArrayList<Paciente> pacientes;
	ArrayList<Medicamento> medicamentos;
	
	Paciente paciente;
	Medicamento medicamento;
	cadPaciente cadPac = new cadPaciente();
	cadMedicamento cadMed = new cadMedicamento();
	listaPaciente listPac = new listaPaciente();
	
	Scanner ler = new Scanner(System.in);

	int option=-1;

	public void menuDeCadastros() {

		do {
			System.out.println("CADASTRO");
			
			System.out.println("1 - Paciente");
			System.out.println("2 - Medicamento");
			System.out.println("3 - Listar Paciente");
			System.out.println("0 - Sair");
			option = ler.nextInt();

			switch(option){
			
				case 1:{
					cadPac.cadastraPaciente();
					break;
				}
				case 2:{
					cadMed.cadastraMedicamento();
					break;
				}
				case 3:{
					listPac.listarPacientes();
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

	
	
	
	public void listarPacientes(){
		
		
		
	}
	
	public void listarMedicamentos(){
		
		
		
		
	}
}
