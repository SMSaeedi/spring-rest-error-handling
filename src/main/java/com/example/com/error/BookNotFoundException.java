package com.example.com.error;

public class BookNotFoundException  {

    public static class Builder extends RuntimeException {

        private Long id;

        public Builder() {
        }

        public Builder(Long id) {
            this.id = id;
        }
    }
}