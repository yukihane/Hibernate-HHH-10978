package com.github.yukihane.hello.java.jpa.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mypu");
        factory.close();
    }
}
