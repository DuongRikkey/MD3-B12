package com.ra.dao;

import java.util.List;

public interface IGenericDao<T,E> {
    void andAndUpdate(T t);
    void remove(E id);
    int findIndexByID(E id);
    List<T> findAll();
    E getNewId(T t);
}
