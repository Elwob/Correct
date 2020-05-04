package com.company.database.repositories;

import java.util.List;

public interface Repository<T> {
    public void create(T entity);

    public List<T> read();

    public void update();

    public void delete(int id);
}
