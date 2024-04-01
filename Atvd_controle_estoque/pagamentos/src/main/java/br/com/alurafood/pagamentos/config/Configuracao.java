package br.com.alurafood.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de configuração do Spring.
 *
 * Define configurações personalizadas e beans que devem ser gerenciados pelo Spring ApplicationContext.
 * Beans definidos aqui podem ser injetados automaticamente em outras partes da aplicação.
 */
@Configuration
public class Configuracao {

    /**
     * Define um bean para o ModelMapper.
     *
     * O ModelMapper é uma biblioteca útil para o mapeamento automático entre objetos de domínio e objetos DTO (Data Transfer Object).
     * Este bean facilita a injeção do ModelMapper em toda a aplicação, promovendo a reutilização e mantendo o código limpo.
     *
     * @return Uma nova instância do ModelMapper configurada para ser usada na aplicação.
     */
    @Bean
    public ModelMapper obterModelMapper(){
        return new ModelMapper();
    }
}
