package br.com.alurafood.pagamentos.model;

/**
 * Enumeração que define os possíveis estados de um pagamento no sistema.
 *
 * Cada estado representa uma etapa distinta no ciclo de vida de um pagamento,
 * permitindo que a aplicação gerencie as transações de forma consistente e previsível.
 */
public enum Status {
    // O pagamento foi criado mas ainda não foi confirmado.
    CRIADO,

    // O pagamento foi confirmado com sucesso.
    CONFIRMADO,

    // O pagamento foi cancelado e não será processado.
    CANCELADO
}
