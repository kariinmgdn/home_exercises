package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(number -> (int) Math.sqrt(number)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return users.stream().mapToInt(user -> user.getAge() > 25 ? 1: 0).sum();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(integer -> integer).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(name -> Arrays.stream(name.split(" ")).toList().get(0)).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        List<String> stringList= new ArrayList<>();
        for (String name:names) {
            stringList.addAll(Arrays.asList(name.split("")));
        }
        return stringList.stream().distinct().toList();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).toList().toString().replace("[", "").replace("]", "");
    }

    public static double getAverageAge(List<User> users) {
        return (double) users.stream().mapToInt(User::getAge).sum() / users.size();
    }

    public static Integer getMaxAge(List<User> users) {
        return Collections.max(users.stream().map(User::getAge).toList());
    }

    public static Integer getMinAge(List<User> users) {
        return Collections.min(users.stream().map(User::getAge).toList());
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(user -> user.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        users.sort(Comparator.comparingInt(User::getAge));
        return users;
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        List<Integer> integers = new ArrayList<>();
        for(int i = 2; i<= 29; i++) {
            if(isPrime(i)) {
                integers.add(i);
            }
        }
        return integers;
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        List<Integer> integers = new ArrayList<>();
        for(int i = 0; i< 10; i++) {
            Random random = new Random();
            integers.add(random.nextInt(15));
        }
        return integers;
    }

    public static User findOldest(List<User> users) {
        return users.stream().findFirst().orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return new IntSummaryStatistics(users.size(), getMinAge(users), getMaxAge(users), users.stream().mapToInt(User::getAge).sum());
    }
}
