import java.time.LocalDate;
import java.time.Period;

public class CalculadoraTempo {
    public static void main(String[] args) {
        // Defina a data de referência (18 de janeiro de 2022)
        LocalDate dataReferencia = LocalDate.of(2023, 1, 18);

        // Obtenha a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcule a diferença entre as datas
        Period periodo = Period.between(dataReferencia, dataAtual);

        // Extraia os anos, meses e dias da diferença
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Exiba os resultados
        System.out.println("Desde 18 de janeiro de 2022 até hoje:");
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
