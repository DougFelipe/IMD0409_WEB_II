// Define o pacote ao qual a interface PagamentoRepository pertence.
// Isso ajuda a organizar o código seguindo a estrutura do projeto.
package br.com.alurafood.pagamentos.repository;

// Importações de classes e interfaces necessárias.
// A classe Pagamento é a entidade JPA representando a tabela de pagamentos no banco de dados,
// e JpaRepository é a interface do Spring Data JPA que fornece operações CRUD genéricas.
import br.com.alurafood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface para o repositório de pagamentos.
 * Estende JpaRepository para herdar operações CRUD para a entidade Pagamento.
 *
 * O Spring Data JPA simplifica a implementação do padrão de repositório e reduz a quantidade de código boilerplate necessário.
 * Ao estender JpaRepository, essa interface automaticamente possui métodos como save(), findById(), findAll(), deleteById(), etc.
 *
 * Tipo de entidade: Pagamento
 * Tipo de chave primária da entidade: Long
 */
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    // Neste ponto, não é necessário definir nenhum método adicional.
    // JpaRepository fornece uma ampla gama de operações CRUD para serem utilizadas diretamente.
}
