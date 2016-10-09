package java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java8.Seniority.JUNIOR;
import static java8.Seniority.MIDDLE;
import static java8.Seniority.SENIOR;

/**
 * Created by Jeka on 11/09/2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       /* List<Integer> list = Arrays.asList(2,4,1,6,23,73,41);
        list.sort(Integer::compareTo);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\temp\\a.tzt"));
        Stream<String> lines = bufferedReader.lines();
*/


        List<Employee> employees = Arrays.asList(new Employee(22000), new Employee(12000), new Employee(24000), new Employee(2000));
        Map<Seniority, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee -> {
            if (employee.getSalary() > 20000) {
                return SENIOR;
            }
            if (employee.getSalary() < 10000) {
                return JUNIOR;
            }
            return MIDDLE;
        }));

        System.out.println(map);


    }
}
