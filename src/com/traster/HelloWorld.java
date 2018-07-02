//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> cities = new ArrayList();
        Collections.addAll(cities, new String[]{"Paris", "Londos", "Toronto"});
        Stream var10000 = cities.stream().filter((c) -> {
            return c.length() == 5;
        });
        PrintStream var10001 = System.out;
        System.out.getClass();
        var10000.forEach(var10001::println);
        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter((c) -> {
            return c.length() == 6;
        });
        citiesStream.forEach((c) -> {
            System.out.println("c = " + c);
        });
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4});
        var10001 = System.out;
        System.out.getClass();
        intStream.forEach(var10001::println);
        ArrayList<Phone> phones = new ArrayList();
        Collections.addAll(phones, new Phone[]{new Phone("Samsung Galaxy", 678), new Phone("Apple Iphone", 576), new Phone("Google Pixel", 6475)});
        Stream<Phone> phoneStream = Stream.of(new Phone("Samsung Galaxy", 678), new Phone("Apple Iphone", 576), new Phone("Google Pixel", 6475));
        phoneStream.filter((p) -> {
            return p.getPrice() < 6000;
        }).forEach((s) -> {
            System.out.println("s = " + s);
        });
        var10000 = phones.stream().map(Phone::getName);
        var10001 = System.out;
        System.out.getClass();
        var10000.forEach(var10001::println);
        Customer customer = new Customer("Jack");
        Optional<Customer> opCustomer = Optional.ofNullable(customer);
        var10000 = phones.stream().sorted((a, b) -> {
            return Integer.compare(a.getPrice(), b.getPrice());
        }).map(Phone::getName);
        var10001 = System.out;
        System.out.getClass();
        var10000.forEach(var10001::println);
        var10000 = phones.stream().sorted((a, b) -> {
            return Integer.valueOf(a.getPrice()).compareTo(b.getPrice());
        }).map(Phone::getName);
        var10001 = System.out;
        System.out.getClass();
        var10000.forEach(var10001::println);
        var10000 = phones.stream().distinct().map(Phone::getName);
        var10001 = System.out;
        System.out.getClass();
        var10000.forEach(var10001::println);
        int countPhone = (int)phones.stream().count();
        ArrayList<Integer> numbers = new ArrayList();
        Collections.addAll(numbers, new Integer[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9, 0});
        numbers.removeIf((integer) -> {
            return integer == 8;
        });
        System.out.println("numbers.size() = " + numbers.size());
        numbers.clear();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("numbers.stream().min(Integer::compareTo) = " + numbers.stream().min(Integer::compareTo).get());
        String location = (String)opCustomer.flatMap(Customer::getAddress).map(Address::getLocation).orElse("No address");
        Optional var47 = opCustomer.flatMap(Customer::getAddress).map(Address::getLocation);
        var10001 = System.out;
        System.out.getClass();
        var47.ifPresent(var10001::println);
        Map<String, Integer> phonesMap = (Map)phones.stream().collect(Collectors.toMap(Phone::getName, Phone::getPrice));
        phonesMap.forEach((k, v) -> {
            System.out.printf("%s %d \n", k, v);
        });
        Comparator<Phone> phone_price = Comparator.comparing(Phone::getPrice).reversed();
        phones.stream().sorted(Comparator.comparing(Phone::getPrice).reversed()).forEach((phonex) -> {
            System.out.println("Phone::getName+ Phone::getPrice = " + phonex.getName() + phonex.getPrice());
        });
        new TreeMap();
        TreeMap<String, Integer> phonesTreeMap = new TreeMap((Map)phones.stream().collect(Collectors.toMap(Phone::getName, Phone::getPrice)));
        phonesTreeMap.compute("Tester", (key, value) -> {
            return Objects.isNull(value) ? 0 : value + 77;
        });
        phonesTreeMap.computeIfPresent("234", (key, value) -> {
            return value + 2;
        });
        phonesTreeMap.computeIfAbsent("ret", (key) -> {
            return key.length();
        });
        phonesTreeMap.merge("Tester", 12, (key, value) -> {
            return key + 5;
        });
        int valuePhonesTreeMap = (Integer)phonesTreeMap.getOrDefault("Tester", 0);
        System.out.println("valuePhonesTreeMap = " + valuePhonesTreeMap);
        phonesTreeMap.putIfAbsent("rett", 99);
        phonesTreeMap.replace("rett", 199);
        phonesTreeMap.replace("rett", 199, 299);
        phonesTreeMap.replaceAll((a, b) -> {
            return a == "rett" ? 299 : 399;
        });
        phonesTreeMap.forEach((k, v) -> {
            System.out.printf("%s %d \n", k, v);
        });
        ArrayList<String> filteredPhones = (ArrayList)phones.stream().map(Phone::getName).filter((s) -> {
            return s.length() > 12;
        }).collect(ArrayList::new, List::add, List::addAll);
        filteredPhones.forEach((p) -> {
            System.out.printf("%s \n", p);
        });
        Stream<String> stringStream = Stream.of("2", "544", "784845");
        String wordResult = stringStream.parallel().filter((w) -> w.length() > 1).unordered()
        .sequential().reduce("Result", (x, y) -> {
            return x + " " + y;
        });
        System.out.println("result = " + wordResult);
        int[] arraySetAll = Arrays.copyOf(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        Arrays.parallelSetAll(arraySetAll, (ix) -> {
            return ix + 3;
        });
        Arrays.parallelSetAll(arraySetAll, (ix) -> {
            return new Random().nextInt(++ix);
        });
        System.out.println("arraySetAll = " + Arrays.toString(arraySetAll));
        int[] var19 = arraySetAll;
        int var20 = arraySetAll.length;

        for(int var21 = 0; var21 < var20; ++var21) {
            int i = var19[var21];
            System.out.print(" " + i);
        }

        Arrays.parallelSort(arraySetAll, 3, 5);
        System.out.println(Arrays.toString(arraySetAll));
        Arrays.parallelPrefix(arraySetAll, (x, y) -> {
            return x + y;
        });
        System.out.println(Arrays.toString(arraySetAll));
        IntStream var48 = Arrays.stream(arraySetAll);
        var10001 = System.out;
        System.out.getClass();
        var48.forEach(var10001::println);
        Spliterator spliterator = Arrays.spliterator(arraySetAll);
        spliterator.forEachRemaining((notify) -> {
            System.out.print(" " + notify);
        });
        Map<String, List<Phone>> phonesByName = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName));
        Iterator var51 = phonesByName.entrySet().iterator();

        while(var51.hasNext()) {
            Entry<String, List<Phone>> items = (Entry)var51.next();
            System.out.println("items.getKey() = " + (String)items.getKey());
            System.out.println("items.getKey() = " + (String)items.getKey());
            Iterator var23 = ((List)items.getValue()).iterator();

            while(var23.hasNext()) {
                Phone phone = (Phone)var23.next();
                System.out.println("phone.getName() = " + phone.getName());
            }

            System.out.println();
        }

        phonesByName.forEach((key, value) -> {
            System.out.println("key = " + key);
            value.forEach((phone) -> {
                System.out.println("phone.getName() = " + phone.getName());
            });
        });
        Map<Boolean, List<Phone>> phoneByPartitioning = (Map)phones.stream().collect(Collectors.partitioningBy((p) -> {
            return p.getName().contains("Google");
        }));
        phoneByPartitioning.forEach((key, value) -> {
            System.out.println("key = " + key);
            value.forEach((phone) -> {
                System.out.println("phone.getName() = " + phone.getName());
            });
        });
        Map<String, Long> phonesByNameCount = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName, Collectors.counting()));
        phonesByNameCount.forEach((key, value) -> {
            System.out.println("key + \" value \" + value = " + key + " value " + value);
        });
        Map<String, Integer> phonesByNameSum = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName, Collectors.summingInt(Phone::getPrice)));
        phonesByNameSum.forEach((key, value) -> {
            System.out.println("key + \" value \" + value = " + key + " value " + value);
        });
        Map<String, Optional<Phone>> phonesByNameMax = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName, Collectors.maxBy(Comparator.comparing(Phone::getPrice))));
        phonesByNameMax.forEach((key, value) -> {
            System.out.println("key + " + key + " value " + ((Phone)value.orElse(new Phone("Siemens", 5674))).getName());
        });
        Map<String, IntSummaryStatistics> phonesByNameSummary = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName, Collectors.summarizingInt(Phone::getPrice)));
        phonesByNameSummary.forEach((key, value) -> {
            System.out.println("key = " + key + " value " + value.getSum());
        });
        Map<String, ArrayList<String>> phonesByNameList = (Map)phones.stream().collect(Collectors.groupingBy(Phone::getName, Collectors.mapping(Phone::getName, Collectors.toCollection(ArrayList::new))));
        phonesByNameList.forEach((key, value) -> {
            System.out.println("key = " + key);
            value.forEach((n) -> {
                System.out.println("n = " + n);
            });
        });
        String str = "{\"name\" : \"Bob\" , \"price\" : \"123\" }";
        String regex = "\\w\\s";
        String path = "E:\\del3.del";
        String line = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            Throwable var32 = null;

            try {
                while((line = reader.readLine()) != null) {
                    System.out.println("line = " + line);
                }
            } catch (Throwable var44) {
                var32 = var44;
                throw var44;
            } finally {
                if (reader != null) {
                    if (var32 != null) {
                        try {
                            reader.close();
                        } catch (Throwable var43) {
                            var32.addSuppressed(var43);
                        }
                    } else {
                        reader.close();
                    }
                }

            }
        } catch (IOException var46) {
            System.out.println("excepton.getMessage() = " + var46.getMessage());
        }

        String path1 = "E:\\del3.del";
        ArrayList lines = new ArrayList();

        try {
            lines = new ArrayList(Files.readAllLines(Paths.get(path1), StandardCharsets.ISO_8859_1));
        } catch (IOException var42) {
            System.out.println("excepton.getMessage() = " + var42.getMessage());
        }

        var10001 = System.out;
        System.out.getClass();
        lines.forEach(var10001::println);
    }

    static void hello() {
        System.out.println("true = true");
    }

    static void sum(int x, int y) {
        int z = x + y;
        System.out.println("z = " + z);
    }

    static void sumVar(int... nums) {
        int result = 0;
        int[] var2 = nums;
        int var3 = nums.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int x = var2[var4];
            result += x;
        }

        System.out.println("result = " + result);
    }

    static int factorial(int x) {
        return x == 1 ? 1 : x * factorial(x - 1);
    }

    static void changeName(PersonAge p) {
        p.setName("Aline");
    }

    static int getFactirial(int num) throws Exception {
        if (num < 1) {
            throw new Exception("Less 1");
        } else {
            int result = 1;

            for(int i = 1; i < num; ++i) {
                result *= i;
            }

            return result;
        }
    }

    static void read(Printable pr) {
        pr.print();
    }

    static Printable CreatePrintable(String name, boolean option) {
        return (Printable)(option ? new Book(name, "Undefined") : new Journal(name));
    }

    static enum Operation {
        SUM {
            public int action(int x, int y) {
                return x + y;
            }
        },
        MINUS {
            public int action(int x, int y) {
                return x - y;
            }
        };

        private Operation() {
        }

        public abstract int action(int var1, int var2);
    }

    static enum Color {
        RED("1234"),
        GREEN("3456"),
        YELLOW("7890");

        private String code;

        private Color(String code) {
            this.code = code;
        }

        public String getCode() {
            return this.code;
        }
    }

    static enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THUESDAY,
        FRIDAY,
        SATUNDAY,
        SUNDAY;

        private Day() {
        }
    }
}
