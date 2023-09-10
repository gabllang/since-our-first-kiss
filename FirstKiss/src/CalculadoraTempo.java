import java.time.LocalDateTime;
import java.time.Duration;
// comit só para ficar o verdinho do github

public class CalculadoraTempo {
    public static void main(String[] args) {
        // Defina a data e hora de referência (18 de janeiro de 2022, 00:00:00)
        LocalDateTime dataReferencia = LocalDateTime.of(2023, 1, 18, 0, 0, 0);

        // Obtenha a data e hora atual
        LocalDateTime dataAtual = LocalDateTime.now();

        // Calcule a diferença entre as datas e horas
        Duration duracao = Duration.between(dataReferencia, dataAtual);

        // Extraia os anos, meses, dias, horas, minutos e segundos da diferença
        long anos = duracao.toDays() / 365;
        long meses = (duracao.toDays() % 365) / 30;
        long dias = duracao.toDays() % 30;
        long horas = duracao.toHours() % 24;
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.getSeconds() % 60;

        // Exiba os resultados
        System.out.println();
        System.out.println("Desde o dia do nosso primeiro beijo até agora:");
        System.out.println(anos + " anos, " + meses + " meses, " + dias + " dias, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}
