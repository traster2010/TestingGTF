//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaApp {
    static int m = 20;
    static int n = 10;

    public LambdaApp() {
    }

    public static void main(String[] args) {
        Operationable<Integer> operation1 = (x, y) -> {
            return x + y;
        };
        Operationable<String> operation2 = (x, y) -> {
            return x + y;
        };
        System.out.println(operation1.calculate(10, 20));
        System.out.println((String)operation2.calculate("10", "20"));
        int z = 20;
        int w = 39;
        Operation operation3 = () -> {
            return z + w;
        };
        System.out.println(operation3.calculate());
        Operation operation4 = () -> {
            n = 30;
            return m + n;
        };
        System.out.println(operation4.calculate());
        Expression fun = (n) -> {
            return n % 2 == 0;
        };
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, fun));
        System.out.println(sum(nums, (n) -> {
            return n > 5;
        }));
        System.out.println(sum(nums, ExpressionHelper::isEven));
        Expression fun1 = ExpressionHelper::isPositive;
        System.out.println(sum(nums, fun1));
        ExpressionHelper exprHelper = new ExpressionHelper();
        PrintStream var10000 = System.out;
        exprHelper.getClass();
        var10000.println(sum(nums, exprHelper::isEven2));
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println("user.getName() = " + user.getName());
        Operation1 func = action(1);
        int a = func.execute(10, 12);
        int b = action(2).execute(13, 15);
        Predicate<Integer> isPositive = (x) -> {
            return x > 0;
        };
        System.out.println("isPositive.test() = " + isPositive.test(15));
        BinaryOperator<Integer> multiplus = (x, y) -> {
            return x * y;
        };
        System.out.println("multiplus.apply(3, 4) = " + multiplus.apply(3, 4));
        UnaryOperator<Integer> square = (x) -> {
            return x * x;
        };
        System.out.println("square.apply(4) = " + square.apply(4));
        Function<Integer, String> convert = (x) -> {
            return x + " dollars";
        };
        System.out.println("convert.apply() = " + (String)convert.apply(15));
        BiFunction<Integer, Integer, String> convert1 = (x, y) -> {
            return x + String.valueOf(y);
        };
        System.out.println("convert1.apply(10 , 15) = " + (String)convert1.apply(10, 15));
        Consumer<String> printer = (x) -> {
            System.out.println("x = " + x);
        };
        printer.accept("12");
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Input name");
            String name = in.nextLine();
            return new User(name);
        };
        User user1 = (User)userFactory.get();
        User user2 = (User)userFactory.get();
        System.out.println("User1.getName() = " + user1.getName());
        System.out.println("User2.getName() = " + user2.getName());
    }

    private static Operation1 action(int n) {
        switch(n) {
            case 1:
                return (x, y) -> {
                    return x + y;
                };
            case 2:
                return (x, y) -> {
                    return x - y;
                };
            case 3:
                return (x, y) -> {
                    return x * y;
                };
            default:
                return (x, y) -> {
                    return 0;
                };
        }
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        int[] var3 = numbers;
        int var4 = numbers.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int number = var3[var5];
            if (func.isEqual(number)) {
                result += number;
            }
        }

        return result;
    }
}
