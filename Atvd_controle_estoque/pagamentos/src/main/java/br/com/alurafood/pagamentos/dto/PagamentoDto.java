package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Classe DTO para Pagamento.
 *
 * Esta classe é usada para transferir dados de pagamento entre diferentes camadas da aplicação,
 * principalmente para comunicação entre a camada de serviço e a camada de apresentação (controllers).
 *
 * O uso de DTOs ajuda a desacoplar a camada de modelo de domínio da camada de apresentação e fornece flexibilidade
 * para moldar os dados conforme necessário para as operações da API, sem alterar a estrutura das entidades de domínio.
 */
@Getter
@Setter
public class PagamentoDto {

    // Identificador único do pagamento. Pode ser nulo em casos de criação, onde o ID ainda não foi gerado.
    private Long id;

    // Valor total do pagamento. Deve ser um valor positivo.
    private BigDecimal valor;

    // Nome associado ao método de pagamento, como o titular do cartão.
    private String nome;

    // Número do método de pagamento, por exemplo, um número de cartão de crédito.
    private String numero;

    // Data de validade do método de pagamento no formato MM/YY.
    private String expiracao;

    // Código de segurança do método de pagamento, como um CVV de cartão de crédito.
    private String codigo;

    // Status atual do pagamento, representando o estado na máquina de estados de pagamentos.
    private Status status;

    // Identificador da forma de pagamento escolhida para este pagamento.
    private Long formaDePagamentoId;

    // Identificador do pedido associado a este pagamento.
    private Long pedidoId;
}
