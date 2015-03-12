

public class cadPaciente{

    private String nome;
    private String cpf;
    private String sexo;
    private String dataNascimento;

	public Paciente cadastraPaciente(){


		Paciente paciente = new Paciente(nome, cpf, sexo, dataNascimento);

		System.out.println("### PACIENTE ###");
		System.out.println("");
		    paciente.setNome(Console.lerString("Nome: "));
		    paciente.setCpf(Console.lerString("CPF: "));
		    paciente.setSexo(Console.lerString("Sexo: "));
		    paciente.setDataNascimento(Console.lerString("Data Nascimento: "));

		return paciente;
	}

}

