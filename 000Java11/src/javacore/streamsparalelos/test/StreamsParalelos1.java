/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.streamsparalelos.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class StreamsParalelos1 {

    public static void main(String[] args) {
        long num = 10_000_000_000L;
        somaFor(num);
        //somaStream(num);
        //somaStreamParalelo(num);
        somaRangeClosedStream(num);
        somaRangeClosedParallelStream(num);
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        // mudar numero de thread : System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","4");
    }

    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        
        for(long i=1L;i<=num;i++){
            result+=i;
        }
        long end = System .currentTimeMillis();
        System.out.println(result+" "+(end-init)+ " ms");
    }
    
    
    private static void somaStream(long num) {
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        
        result = Stream.iterate(1L, i->i+1).limit(num).reduce(0L,Long::sum);
                
        long end = System .currentTimeMillis();
        System.out.println(result+" "+(end-init)+ " ms");
    }
    
    private static void somaStreamParalelo(long num) {
        System.out.println("Stream Paralelo");
        long result = 0;
        long init = System.currentTimeMillis();
        
        result = Stream.iterate(1L, i->i+1).limit(num).parallel().reduce(0L,Long::sum);
                
        long end = System .currentTimeMillis();
        System.out.println(result+" "+(end-init)+ " ms");
    }
    
    private static void somaRangeClosedStream(long num) {
        System.out.println("soma Range Closed Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        
        result = LongStream.rangeClosed(1L,num).reduce(0L,Long::sum);    
        long end = System .currentTimeMillis();
        System.out.println(result+" "+(end-init)+ " ms");
    } 
    
    private static void somaRangeClosedParallelStream(long num) {
        System.out.println("soma Range Closed Stream Paralelo ");
        long result = 0;
        long init = System.currentTimeMillis();
        
        result = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);    
        long end = System .currentTimeMillis();
        System.out.println(result+" "+(end-init)+ " ms");
    }
    
    
}
/*
- benchmark
- unboxing e boxing
- algumas operacoes sao piores paralelas do que sequenciais
(limit, findfirst) por precisarem estar em ordem sao piores
(findany ) nao precisa estar em ordem e fica melhor paralela
- considerar o custo total da computacao N( numero de tarefas),P(custo de processamento), geralmente P alto tem melhor com paralelos
- quantidade de dados, pequena quase nunca usar paralelos é o certo
- tipos de colecoes .. foto java 8 in action
- tamanho do Stream(tamanho definido)
- processamento do merge




*/