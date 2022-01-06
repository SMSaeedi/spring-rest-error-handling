package com.example.com.error.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author, String> {

    List<String> authors = Arrays.asList("Markus Gärtner", "Micheal Newton", "Jane Austen", "Herbert Schildt", "Conan Doyle");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return authors.contains(value);
    }
}