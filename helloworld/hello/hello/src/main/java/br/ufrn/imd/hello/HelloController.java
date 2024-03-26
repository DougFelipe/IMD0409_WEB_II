package br.ufrn.imd.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Olá mundo, dependente do horário: " + getGreetingBasedOnTime();
    }

    private String getGreetingBasedOnTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        int hour = currentDateTime.getHour();

        // Formatar a data e hora
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String date = currentDateTime.format(dateFormatter);
        String time = currentDateTime.format(timeFormatter);

        // saudação com base na hora
        String greeting;
        if (hour < 12) {
            greeting = "Bom dia";
        } else if (hour < 18) {
            greeting = "Boa tarde";
        } else {
            greeting = "Boa noite";
        }

        // Retornar saudação com data e hora
        return greeting + "! Hora atual: " + time + " - Data: " + date;
    }
}
