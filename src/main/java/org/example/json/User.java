package org.example.json;

import java.util.List;

public class User {
    private String name;
    private int favoriteNumber;
    private String favoriteColor;
    private FavoriteCar favoriteCar;

    private List<Portfolio> portfolioList;

    public User(String name, int favoriteNumber, String favoriteColor, FavoriteCar favoriteCar, List<Portfolio> portfolioList) {
        this.name = name;
        this.favoriteNumber = favoriteNumber;
        this.favoriteColor = favoriteColor;
        this.favoriteCar = favoriteCar;
        this.portfolioList = portfolioList;
    }

    public String getName() {
        return name;
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public FavoriteCar getFavoriteCar() {
        return favoriteCar;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public List<Portfolio> getPortfolioList() {
        return portfolioList;
    }


    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setFavoriteCar(FavoriteCar favoriteCar) {
        this.favoriteCar = favoriteCar;
    }

    public void setPortfolioList(List<Portfolio> portfolioList) {
        this.portfolioList = portfolioList;
    }
}
