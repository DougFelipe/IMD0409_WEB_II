package br.com.alurafood.pagamentos.model;

// Importações de bibliotecas e frameworks necessários, incluindo JPA para mapeamento objeto-relacional,
// Bean Validation para validação de campos, e Lombok para redução de boilerplate em getters, setters e construtores.
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Classe de entidade representando um pagamento no sistema.
 * Anotada com @Entity para mapeamento JPA e @Table para especificar o nome da tabela no banco de dados.
 * Utiliza Lombok para gerar automaticamente getters e setters, além de construtores com e sem argumentos.
 */
@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {

    // Identificador único para cada pagamento, gerado automaticamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Valor do pagamento. Deve ser um valor positivo.
    @NotNull
    @Positive
    private BigDecimal valor;

    // Nome associado ao método de pagamento.
    @NotBlank
    @Size(max = 100)
    private String nome;

    // Número do método de pagamento, como um cartão de crédito.
    @NotBlank
    @Size(max = 15)
    private String numero;

    // Data de expiração do método de pagamento.
    @NotBlank
    @Size(max = 7)
    private String expiracao;

    // Código de segurança do método de pagamento.
    @NotBlank
    @Size(max = 3, min = 3)
    private String codigo;

    // Status atual do pagamento, utilizando enum para tipos pré-definidos.
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    // Identificador do pedido associado a este pagamento.
    @NotNull
    private Long pedidoId;

    // Identificador da forma de pagamento utilizada.
    @NotNull
    private Long formaDePagamentoId;

    // Nota: Os campos estão anotados com validações do Jakarta Bean Validation para garantir a integridade dos dados.
}
