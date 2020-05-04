package com.company.database.repository;

import java.util.List;

public interface Repository<T> {
    public T create(T entity);

    public List<T> read();

    public void update();

    public void delete(int id);
}
