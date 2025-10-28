package models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    private String first_name;
    private String last_name;
    private String teuda;
    private String sex;
    private String email;
    private String phone;
    private String birthdate;
    private String aliya_year;
    private String password;
    private String password_confirm;

}
