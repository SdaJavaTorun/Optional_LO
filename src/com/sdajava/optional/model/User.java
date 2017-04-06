package com.sdajava.optional.model;

import java.util.Optional;

/**
 * Created by lukas on 05.04.2017.
 */
public class User {

    private String username;
    private Optional<String> address;

    public User(String username) {
        this.username = username;
        this.address = Optional.empty();
    }

    public User(String username, String address) {
        this.username = username;
        this.address = Optional.ofNullable(address)
                               .orElse("Brak adresu");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Optional<String> getAddress() {
        return address;
    }

    public void setAddress(Optional<String> address) {
        this.address = address;
    }
}
