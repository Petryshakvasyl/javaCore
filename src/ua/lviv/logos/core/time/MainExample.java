package ua.lviv.logos.core.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class MainExample {

    public static void main(String[] args) {
        // yyyy-MM-dd
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);

        LocalDate localDate1 = LocalDate.parse("2020-03-06");

//        LocalDate localDate1 = LocalDate.parse("03-06-2020");
//        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2020, 3, 6);
//        System.out.println(localDate2);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        LocalDate previousMonthSameDay = today.minus(1, ChronoUnit.MONTHS);

        System.out.println("previousMonthSameDay: " + previousMonthSameDay);

        DayOfWeek dayOfWeek = tomorrow.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(tomorrow.getDayOfMonth());
        System.out.println(tomorrow.getDayOfYear());

        System.out.println("tomorow is before today: " + tomorrow.isBefore(today));
        System.out.println("tomorow is after today: " + tomorrow.isAfter(today));


        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        LocalTime sm = nowTime.minus(2, ChronoUnit.MINUTES);
        System.out.println(sm);


        LocalDateTime now = LocalDateTime.now();

        System.out.println("now: " + now);


        LocalDateTime of = LocalDateTime.of(2020, Month.MARCH, 20, 6, 50, 10, 250_000_000);

        Duration.of(1, ChronoUnit.SECONDS);
        System.out.println(Duration.of(1, ChronoUnit.SECONDS).toNanos());

        System.out.println("ater tomorrow:" + of.plusDays(2));;
        System.out.println("of: " + of);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        availableZoneIds.stream().filter(id -> id.contains("Europe")).forEach(System.out::println);
        ZoneId zoneId = ZoneId.of("Europe/Warsaw");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);

        LocalDate afterTwoDays = today.plus(Period.ofDays(2));
        int twoDays = Period.between(today, afterTwoDays).getMonths();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.parse("2020-01-01'T'10:20:20", formatter);

    }
}
