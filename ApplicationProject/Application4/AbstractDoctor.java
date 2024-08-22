package com.evergent.CoreJava.Rithen.Application4;

abstract class AbstractDoctor {
    protected final String name;
    protected final String profession;
    protected final int experience;
    protected final String ratings;
    protected final String[] languages;
    protected final String[] counselingFor;

    public AbstractDoctor(String name, String profession, int experience, String ratings, String[] languages, String[] counselingFor) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
        this.ratings = ratings;
        this.languages = languages;
        this.counselingFor = counselingFor;
    }

    public abstract int getSessionCost(String sessionType);
}

