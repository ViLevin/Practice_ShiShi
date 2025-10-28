package utils;

import models.User;
import net.datafaker.Faker;

public class UserFactory {
    static Faker faker = new Faker();
    public static void main(String[] args) {
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.internet().emailAddress());
        System.out.println(Integer.toString(faker.number().numberBetween(111_111_111, 999_999_999)));
        System.out.println(randomUser());
    }

    public static User randomUser(){
        return User.builder()
                .first_name(faker.name().firstName())
                .last_name(faker.name().lastName())
                .teuda(Integer.toString(faker.number().numberBetween(111_111_111, 999_999_999)))
                .sex("1")
                .email(faker.internet().emailAddress())
                .phone("050"+(faker.number().numberBetween(1_111_111, 9_999_999)))
                .birthdate(faker.timeAndDate().birthday(17,50).toString())
                .aliya_year(Integer.toString(faker.number().numberBetween(1970, 2025)))
                .password("Password123!")
                .password_confirm("Password123!")
                .build();
    }
}
