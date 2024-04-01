// Pacote que organiza a classe PagamentosApplication, seguindo a convenção de nomenclatura e estrutura da empresa ou projeto.
package br.com.alurafood.pagamentos;

// Importações do Spring Framework necessárias para executar e configurar a aplicação Spring Boot.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que marca a classe principal da aplicação Spring Boot, habilitando a configuração automática do Spring e a varredura de componentes.
@SpringBootApplication
public class PagamentosApplication {

	// Método principal que serve como ponto de entrada para a aplicação Spring Boot.
	public static void main(String[] args) {
		// Executa a aplicação Spring Boot, criando e configurando o contexto da aplicação Spring a partir da classe PagamentosApplication.
		SpringApplication.run(PagamentosApplication.class, args);
	}

}
