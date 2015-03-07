import java.util.ArrayList;
import java.util.Scanner;


public class cadMedicamento extends Medicamento {
	
	Scanner ler = new Scanner(System.in);
	ArrayList<Medicamento> medicamentos;
	Medicamento medicamento;
	
	
	public void cadastraMedicamento() {

		Medicamento medicamento = new Medicamento();
		
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
	
	
	
	
	
}
