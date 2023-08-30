package org.example.single_responsibility.respository;

import java.util.ArrayList;
import java.util.List;

public class UserRepository<T> {

    private List<T> storage = new ArrayList<>();


    public void save(T item) {
        storage.add(item);
    }
}
