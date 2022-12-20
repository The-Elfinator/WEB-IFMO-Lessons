package ru.itmo.wp.lesson8.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserCredentials {

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 20)
    @Pattern(regexp = "[a-z]+", message = "Only lowercase Latin letters expected")
    private String login;

    @NotNull
    @NotEmpty
    @Size(min = 4, max = 64)
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
