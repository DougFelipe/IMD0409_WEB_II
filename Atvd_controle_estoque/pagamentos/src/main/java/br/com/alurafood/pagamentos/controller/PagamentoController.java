package br.com.alurafood.pagamentos.controller;

import br.com.alurafood.pagamentos.dto.PagamentoDto;
import br.com.alurafood.pagamentos.service.PagamentoService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Controlador REST para gerenciar operações relacionadas a pagamentos.
 * Mapeia requisições HTTP para métodos de serviço e transforma dados entre o formato de transmissão (JSON) e o formato de aplicação (DTOs).
 */
@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    /**
     * Lista todos os pagamentos, com suporte a paginação.
     *
     * @param paginacao Configurações de paginação fornecidas automaticamente pelo Spring a partir dos parâmetros da requisição.
     * @return Uma página de objetos PagamentoDto.
     */
    @GetMapping
    public Page<PagamentoDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
        return service.obterTodos(paginacao);
    }

    /**
     * Detalha um único pagamento por ID.
     *
     * @param id O identificador único do pagamento a ser detalhado.
     * @return Uma ResponseEntity contendo o PagamentoDto correspondente ou um status 404 se não encontrado.
     */
    @GetMapping("/{id}")
    public ResponseEntity<PagamentoDto> detalhar(@PathVariable @NotNull Long id) {
        PagamentoDto dto = service.obterPorId(id);
        return ResponseEntity.ok(dto);
    }

    /**
     * Cadastra um novo pagamento.
     *
     * @param dto O PagamentoDto contendo os dados do novo pagamento.
     * @param uriBuilder Um UriComponentsBuilder para construir o URI do recurso criado.
     * @return Uma ResponseEntity com o status 201 (Created) e o recurso criado no corpo da resposta.
     */
    @PostMapping
    public ResponseEntity<PagamentoDto> cadastrar(@RequestBody @Valid PagamentoDto dto, UriComponentsBuilder uriBuilder) {
        PagamentoDto pagamento = service.criarPagamento(dto);
        URI endereco = uriBuilder.path("/pagamentos/{id}").buildAndExpand(pagamento.getId()).toUri();

        return ResponseEntity.created(endereco).body(pagamento);
    }

    /**
     * Atualiza um pagamento existente por ID.
     *
     * @param id O identificador único do pagamento a ser atualizado.
     * @param dto O PagamentoDto com os dados atualizados do pagamento.
     * @return Uma ResponseEntity contendo o PagamentoDto atualizado.
     */
    @PutMapping("/{id}")
    public ResponseEntity<PagamentoDto> atualizar(@PathVariable @NotNull Long id, @RequestBody @Valid PagamentoDto dto) {
        PagamentoDto atualizado = service.atualizarPagamento(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    /**
     * Remove um pagamento existente por ID.
     *
     * @param id O identificador único do pagamento a ser removido.
     * @return Uma ResponseEntity com status 204 (No Content) indicando que a operação foi bem-sucedida, mas sem corpo na resposta.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable @NotNull Long id) {
        service.excluirPagamento(id);
        return ResponseEntity.noContent().build();
    }
}
