import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();



		Cadastro cad = new Cadastro();
		cadPaciente cadPac = new cadPaciente();
		cadMedicamento cadMed = new cadMedicamento();
		Paciente pac = new Paciente();
		Medicamento med = new Medicamento();
		
		cad.menuDeCadastros();		
	}

}
