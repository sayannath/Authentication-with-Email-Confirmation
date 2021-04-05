package com.example.authentication.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    public boolean test(String s) {
        //TODO: Regex with an email
        return true;
    }
}
