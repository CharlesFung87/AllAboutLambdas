package com.madhusudhan.wr.allaboutlambdas.introducinglambdas;

import com.madhusudhan.wr.allaboutlambdas.domain.Trade;

public class DissectingLambda {

    /**
     * Functional interface for checking various characteristics of a trade.
     *
     * @param <T>
     */
    interface Tradable<T> {

        boolean check(T t);
    }

    private void checkCharacteristics(Tradable<Trade> tradableLambda, Trade trade) {
        tradableLambda.check(trade);
    }

    // Big trade lambda expression
    Tradable<Trade> bigTradeLambda = (t) -> t.isBigTrade();

    public static void main(String[] args) {
        DissectingLambda client = new DissectingLambda();
        Trade trade = new Trade(1, "APPLE", 15000000, "NEW");

        // Is this a cancelled trade
        client.checkCharacteristics((t) -> t.isCancelledTrade(), trade);

        // multiline code
        client.checkCharacteristics(t -> {
            return t.isCancelledTrade();
        }, trade);

        // Is this a risky trade
        client.checkCharacteristics((t) -> client.isRisky(t), trade);

        // use method references
        client.checkCharacteristics(client::isRisky, trade);
    }

    private boolean isRisky(Trade t) {
        boolean riskyFlag = false;

        if ((t.getQuantity() > 5000000) || (getRiskIndicator() > 5)) {
            riskyFlag = true;
        }

        return riskyFlag;
    }

    private int getRiskIndicator() {
        return 5;
    }
}
