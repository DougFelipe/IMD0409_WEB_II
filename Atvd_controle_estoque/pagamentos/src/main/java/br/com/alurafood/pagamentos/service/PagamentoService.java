// Define o pacote ao qual a classe PagamentoService pertence, seguindo a estrutura organizacional do projeto.
package br.com.alurafood.pagamentos.service;

// Importações de classes e interfaces utilizadas na classe PagamentoService.
import br.com.alurafood.pagamentos.dto.PagamentoDto;
import br.com.alurafood.pagamentos.model.Pagamento;
import br.com.alurafood.pagamentos.model.Status;
import br.com.alurafood.pagamentos.repository.PagamentoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

// Anotação que indica que esta classe é um componente de serviço no contexto do Spring, possibilitando a injeção de dependências e a transação de dados.
@Service
public class PagamentoService {

    // Injeção do repositório PagamentoRepository para operações de persistência relacionadas a pagamentos.
    @Autowired
    private PagamentoRepository repository;

    // Injeção do ModelMapper para facilitar a conversão entre objetos de entidades e DTOs.
    @Autowired
    private ModelMapper modelMapper;

    // Método para obter uma página de objetos PagamentoDto, utilizada para listagem paginada de pagamentos.
    public Page<PagamentoDto> obterTodos(Pageable paginacao) {
        return repository
                .findAll(paginacao)
                .map(p -> modelMapper.map(p, PagamentoDto.class));
    }

    // Método para obter um único PagamentoDto pelo ID, lançando uma exceção se o pagamento não for encontrado.
    public PagamentoDto obterPorId(Long id) {
        Pagamento pagamento = repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        return modelMapper.map(pagamento, PagamentoDto.class);
    }

    // Método para criar um novo pagamento com base em um DTO fornecido e definir seu status inicial como CRIADO.
    public PagamentoDto criarPagamento(PagamentoDto dto) {
        Pagamento pagamento = modelMapper.map(dto, Pagamento.class);
        pagamento.setStatus(Status.CRIADO);
        repository.save(pagamento);

        return modelMapper.map(pagamento, PagamentoDto.class);
    }

    // Método para atualizar um pagamento existente, identificado pelo ID, com as informações fornecidas no DTO.
    public PagamentoDto atualizarPagamento(Long id, PagamentoDto dto) {
        Pagamento pagamento = modelMapper.map(dto, Pagamento.class);
        pagamento.setId(id);
        pagamento = repository.save(pagamento);
        return modelMapper.map(pagamento, PagamentoDto.class);
    }

    // Método para excluir um pagamento existente pelo ID.
    public void excluirPagamento(Long id) {
        repository.deleteById(id);
    }
}
