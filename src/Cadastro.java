import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	ArrayList<Paciente> pacientes;
	ArrayList<Medicamento> medicamentos;

	Paciente paciente;
	Medicamento medicamento;
	cadPaciente cadPac;
	cadMedicamento cadMed;

	
	Scanner ler = new Scanner(System.in);

	int option=-1;

	public void menuDeCadastros() {

		do {
			System.out.println("CADASTRO");
			
			System.out.println("1 - Paciente");
			System.out.println("2 - Medicamento");
			System.out.println("3 - Listar Paciente");
			System.out.println("0 - Sair");
			option = Console.lerInt("Digite sua opção: ");

			switch(option){
			
				case 1:{
                    cadPac = new cadPaciente();
                    pacientes = new ArrayList<Paciente>();
                    pacientes.add(cadPac.cadastraPaciente());
					break;
				}
				case 2:{
                    cadMed = new cadMedicamento();
                    medicamentos = new ArrayList<Medicamento>();
					medicamentos.add(cadMed.cadastraMedicamento());
					break;
				}
				case 3:{
                    listarPacientes();
                    System.out.println("\n\n");
                    break;
				}
				case 0:{
					System.out.println("Saindo...");
					break;
				}
				default:
					System.out.println("Opção Invalida!!");
			}		
		} while (option != 0);

	}

	
	public void listarPacientes(){

        System.out.println("Lista de pacientes cadastrados:\n");

        for (Paciente p: pacientes){

            System.out.println("\t" + p.getCpf() + " - " + p.getNome());
        }
    }
	
	public void listarMedicamentos(){
		
		
		
		
	}
}
