/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamspac.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class StreamTest5GerandoStreams {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println(" ");
        System.out.println(" ");
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));
        System.out.println("");
        Stream<String> stringStream = Stream.of("willian", "Devdooj", "Acessem o facebook");
        stringStream.map(String::toUpperCase).forEach(s -> System.out.print(s + " "));

        Stream<String> empty = Stream.empty();
        System.out.println("");

        int nums[] = {1, 2, 3, 4, 5};
        OptionalDouble average = Arrays.stream(nums).average();
        System.out.println(average.getAsDouble());

        System.out.println("_____00_____");

        try (Stream<String> lines = Files.lines(Paths.get("teste.txt"), Charset.defaultCharset())) {
            lines
                    .flatMap(line -> Arrays.stream(line.split("\n")))
                    .filter(p -> p.contains("File"))
                    .forEach(System.out::println);

        } catch (IOException ex) {
            System.out.println("erro");
            ex.printStackTrace();
        }

        //fibonacci
        Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                
                .forEach( t->System.out.println(Arrays.toString(t)));
        Stream.iterate(new int[]{0, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                .map(t->t[0])
                .forEach(System.out::println);
        
        
        
        //valores aleatorios
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        ThreadLocalRandom t = ThreadLocalRandom.current();
        Stream.generate(()->t.nextInt(1,100)).limit(20).forEach(System.out::println);
        
    }
}