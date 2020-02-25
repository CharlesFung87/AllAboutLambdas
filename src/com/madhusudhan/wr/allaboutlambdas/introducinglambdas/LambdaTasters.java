package com.madhusudhan.wr.allaboutlambdas.introducinglambdas;

import com.madhusudhan.wr.allaboutlambdas.domain.Trade;
import java.util.function.*;

/**
 * This class defines few lambda expressions.
 *
 * @author mkonda
 *
 */
public class LambdaTasters {

    interface Quote {

        void quoteOfTheDay();
    }

    interface Instrument<T> {

        String extract(T t);
    }

    // Lambda printing out a quote
    Quote quoteLambda = () -> System.out.println("Hello, Lambdas!");
    // NOTE: there is no interface in function package that takes no input and
    // produces no output...Such an interface is largely non-functional. Its 
    // purpose, if any, would be pure side-effects,
    // We can use Runnable instead...
    Runnable quoteLambda2 = () -> System.out.println("Hello, Lambdas!");

    // Lambda fetching the instrument of a Trade
    Instrument<Trade> instrumentLambda = (t) -> t.getInstrument();
    Function<Trade, String> instrumentLambda2 = (t) -> t.getInstrument();

    public static void main(String[] args) {

    }

}
