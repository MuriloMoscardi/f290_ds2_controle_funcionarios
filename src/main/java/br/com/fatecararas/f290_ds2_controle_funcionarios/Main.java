package br.com.fatecararas.f290_ds2_controle_funcionarios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TODO: Testing features	
		
		// Departamento d1 = new Departamento("Design");

		// Departamento depto = departamentoRepository.save(d1);

		// Funcionario f1 = new Funcionario("Camila", "camila@gmail.com", depto);

		// funcionarioRepository.save(f1);

		// List<Funcionario> all = funcionarioRepository.findAll();

		// System.out.println(all);
		// Ultimo sabado de abril.
		//Chamada: Bruna, Luis, Gabriel, Murilo, Camila, 
	}

}
