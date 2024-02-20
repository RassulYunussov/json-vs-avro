package org.example;

import org.example.avro.FavoriteCar;
import org.example.avro.Portfolio;

import java.util.List;
import java.util.Random;

public class UserFactory {

    private static Random random = new Random();
    private static String[] names = new String[]{"Alyssa", "Rainbow", "John", "Salomon"};
    private static String[] cars = new String[]{"Mercedes", "BMW", "Audi", "Porshe"};
    private static String[] colors = new String[]{"Red", "Green", "Blue", "Black"};
    private static String[] companies = new String[]{"Co & A", "Bo & B", "Do & C", "Eo & D"};

    private static String[] positions = new String[]{"CEO", "CIO", "CTO", "CFO"};
    private static String[] responsibilities = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    private UserFactory() {

    }

    public static org.example.avro.User getAvroUser() {
        org.example.avro.User user = new org.example.avro.User();
        user.setName(names[random.nextInt(names.length)]);
        user.setFavoriteNumber(random.nextInt());
        user.setFavoriteColor(colors[random.nextInt(colors.length)]);
        user.setFavoriteCar(new FavoriteCar(cars[random.nextInt(cars.length)], colors[random.nextInt(colors.length)]));
        user.setPortfolioList(List.of(
                new Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                new Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                new Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                new Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)]))
                ));
        return user;
    }

    public static org.example.json.User getJsonUser() {
        org.example.json.User user = new org.example.json.User(
                names[random.nextInt(names.length)],
                random.nextInt(),
                colors[random.nextInt(colors.length)],
                new org.example.json.FavoriteCar(cars[random.nextInt(cars.length)], colors[random.nextInt(colors.length)]),
                List.of(
                        new org.example.json.Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                        new org.example.json.Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                        new org.example.json.Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)])),
                        new org.example.json.Portfolio(companies[random.nextInt(companies.length)], positions[random.nextInt(positions.length)], random.nextInt(), random.nextDouble(), random.nextFloat(), List.of(responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)], responsibilities[random.nextInt(responsibilities.length)]))
                )
        );
        return user;
    }
}
