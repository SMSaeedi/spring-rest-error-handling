package com.example.com.error;

import java.util.Set;

public class BookUnSupportedFieldPatchException  {

    public static class Builder extends RuntimeException {

        private Set<String> keys;

        public Builder(Set<String> keys) {
            this.keys = keys;
        }
    }
}