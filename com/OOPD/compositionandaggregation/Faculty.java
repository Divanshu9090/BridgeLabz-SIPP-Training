package com.OOPD.compositionandaggregation;

class Faculty {
    private String name;
    private String id;

    public Faculty(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " (ID: " + id + ")";
    }
}
