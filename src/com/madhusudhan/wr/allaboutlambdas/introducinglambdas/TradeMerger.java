package com.madhusudhan.wr.allaboutlambdas.introducinglambdas;

import com.madhusudhan.wr.allaboutlambdas.domain.Trade;

public class TradeMerger {

    /**
     * Functional interface for merging trades
     *
     * @author mkonda
     *
     */
    interface Merger {

        Trade merge(Trade t1, Trade t2);
    }

    // The lambda is assigned to a functional interface
    Merger mergedTrade = (t1, t2) -> {
        Trade mergedTrade = new Trade();
        // TODO
        return mergedTrade;
    };

    public static void main(String[] args) {

    }
}
