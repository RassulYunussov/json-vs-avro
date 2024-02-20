package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.avro.User;

import java.io.IOException;

public class App {
    private static final int SERIALIZATION_COUNT = 1_000_000;
    private static final ObjectMapper JSON_SERIALIZER = new ObjectMapper();
    private static final AvroSerializer<User> AVRO_SERIALIZER = new AvroSerializer<>(User.getClassSchema());

    public static long getJsonTime(final int cycles) throws JsonProcessingException {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cycles * SERIALIZATION_COUNT; i++) {
            final var user = UserFactory.getJsonUser();
            final var serialized = JSON_SERIALIZER.writeValueAsString(user);
            JSON_SERIALIZER.readValue(serialized, org.example.json.User.class);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long getAvroTme(final int cycles) throws IOException {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < cycles * SERIALIZATION_COUNT; i++) {
            final var user = UserFactory.getAvroUser();
            final var serialized = AVRO_SERIALIZER.serialize(user);
            AVRO_SERIALIZER.deserialize(serialized);
        }
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++) {
            final var jsonTime = getJsonTime(i);
            final var avroTime = getAvroTme(i);
            System.out.printf("%d mln s/d json time %d ms%n", i, jsonTime);
            System.out.printf("%d mln s/d avro time %d ms%n", i, avroTime);
        }
    }
}
