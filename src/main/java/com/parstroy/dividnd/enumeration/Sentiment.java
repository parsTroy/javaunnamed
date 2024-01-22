package com.parstroy.dividnd.enumeration;

public enum Sentiment {
    BUY("BUY"),
    SELL("SELL"),
    HOLD("HOLD");

    private final String sentiment;

    Sentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getSentiment() {
        return this.sentiment;
    }
}
