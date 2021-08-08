package com.company;

public class GeopluginCredit {
    private String a;

    @Override
    public String toString() {
        return "GeopluginCredit{" +
                "a='" + a + '\'' +
                '}';
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public GeopluginCredit() {
    }

    public GeopluginCredit(String a) {
        this.a = a;
    }
}
