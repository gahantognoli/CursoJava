package je_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        var meuAniversario = LocalDate.of(2025, 6, 13);
        System.out.println(meuAniversario);

        String dataStr = "17/01/2025";
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcreta = LocalDate.parse(dataStr, formatter);
        System.out.println(dataConcreta);

        LocalDate nascimento = LocalDate.of(2023, 1, 28);
        LocalDate dataQueTera15anos = nascimento.plusYears(15);
        System.out.println(dataQueTera15anos);

        var data1 = LocalDate.of(2023, 1, 1);
        var data2 = LocalDate.of(2023, 1, 2);

        System.out.println(data2.isAfter(data1));
        System.out.println(data1.isAfter(data2));
        System.out.println(data2.isBefore(data1));
        System.out.println(data1.isBefore(data2));
        System.out.println(data1.isEqual(data2));

        var data = LocalDate.now();
        var formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter2.format(data));

        var localTime = LocalTime.now();
        System.out.println(localTime);

        var localTime2 = LocalTime.of(13, 0, 0);
        System.out.println(localTime2);

        var dateTimeFormatter = DateTimeFormatter.ofPattern("HHmmss");
        System.out.println(dateTimeFormatter.format(localTime2));

        var localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

        var lcDate = localDateTime.toLocalDate();
        var lcTime = localDateTime.toLocalTime();

        System.out.println(lcDate);
        System.out.println(lcTime);

        var ldtTime = lcDate.atTime(LocalTime.now());
        System.out.println(ldtTime);
    }
}
