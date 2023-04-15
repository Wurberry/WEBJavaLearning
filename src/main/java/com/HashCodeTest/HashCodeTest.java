package com.HashCodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HashCodeTest {

    public static void main(String[] args) {

        List<HashCodeUser> users = new ArrayList<>(Collections.emptyList());
        for (int i = 0; i <= 100; i++) {
            users.add(new HashCodeUser(1, "sfrrgsdgfr", "sdfgfd@mails.com"));
        }

        HashCodeUser user = new HashCodeUser(1, "dsfsd", "dsfsd");
        HashCodeUser user1 = new HashCodeUser(1, "sfrrgsdgfr", "sdfgfd@mails.com");

        System.out.println(users.get(12).hashCode() == user.hashCode());


    }

}
