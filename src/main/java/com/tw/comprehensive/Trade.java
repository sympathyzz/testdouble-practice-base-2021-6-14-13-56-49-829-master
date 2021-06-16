package com.tw.comprehensive;

public class Trade {
    private String reference;
    private String description;

    public Trade(String reference, String description) {
        this.reference = reference;
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public String getDescription() {
        return description;
    }
}
