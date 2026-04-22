package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Education {
    Bachelor("Bachelor"),
    LOWER_SECONDARY("Lower secondary"),
    MASTER("Master"),
    PRIMARY("Primary"),
    UPPER_SECONDARY("Upper secondary"),
    Doctoral("Doctoral");

    private final String value;

    Education(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Education fromString(String value) {
        for (Education e : Education.values()) {
            if (e.value.equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Invalid education: " + value);
    }

    @Override
    public String toString() {
        return value;
    }
}
