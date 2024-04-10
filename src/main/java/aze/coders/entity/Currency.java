package aze.coders.entity;

import java.util.List;

public class Currency {
    private int id;
    private String code;
    private  String name;
    private List<Rate> rates;

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency(int id, String code) {
        System.out.println("id&code constructor");
        this.id = id;
        this.code = code;
    }

    public Currency(String code, String name) {
        System.out.println("code&name constructor");
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rates=" + rates +
                '}';
    }
}
