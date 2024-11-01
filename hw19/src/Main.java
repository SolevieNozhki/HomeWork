import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Set<String>> sets = new HashSet<>();
        Set<String> strings = new HashSet<>();
        strings.add("раз");
        strings.add("два");
        strings.add("три");
        strings.add("3");
        strings.add("4");
        Set<String> strings2 = new HashSet<>();
        strings2.add("Первое");
        strings2.add("Второе");
        strings2.add("Семьдесят шестое");
        Set<String> strings3 = new HashSet<>();
        strings3.add("12");
        strings3.add("783");
        strings3.add("37288736");
        Set<String> strings4 = new HashSet<>();
        strings4.add("Проверка");
        strings4.add("Струн");
        strings4.add("Раз-Два");

        sets.add(strings);
        sets.add(strings2);
        sets.add(strings3);
        sets.add(strings4);

        System.out.println(sets.stream().flatMap(Collection::stream)
                .filter(s -> s.matches("[А-я- ]+"))
                .map(s -> s.replaceAll("[- ]+",""))
                .mapToInt(String::length).sum());

       int maxSize =  sets.stream().flatMap(Collection::stream)
               .mapToInt(String::length)
               .max()
               .getAsInt();
        System.out.println("Самая длинная строка состоит из " + maxSize + " символов");





        List<Employee> employees = EmployeeFactory.createEmployee();

        Employee maxKPI = employees.stream()
                .max(Comparator.comparing(Employee::getKpi)).get();
        System.out.println(maxKPI);

        Employee oldMan = employees.stream()
                .filter(employee -> employee.getAge()>65)
                .findFirst().get();
        System.out.println(oldMan);

        Employee maxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(maxSalary);

        Employee noRussian = employees.stream()
                .filter(employee -> employee.getName().matches("\\w+"))
                .findFirst().get();
        System.out.println(noRussian);


        double avg = employees.stream()
                .mapToInt(Employee::getKpi)
                .average().getAsDouble();
        employees.stream()
                .filter(employee -> employee.getKpi()>avg).forEach(System.out::println);

        double avgKPI = employees.stream()
                .filter(employee -> employee.getName().matches("[А-я]+"))
                .filter(employee -> employee.getAge()<45)
                .filter(employee -> employee.getSalary()>20000)
                .flatMapToInt(employee -> IntStream.of(employee.getKpi()))
                .average().orElse(0);
        System.out.println(avgKPI);

        Map<String,Employee> result = employees.stream()
                .filter(e -> e.getAge() < 35)
                .filter(e -> e.getSalary() > 10000)
                .collect(Collectors.toMap(e -> e.getName() + e.getSurname(), e -> e ));




        }
    }
