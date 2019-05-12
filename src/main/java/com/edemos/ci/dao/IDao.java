/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edemos.ci.dao;

import java.util.List;

/**
 *
 * @author edemos
 * @param <T> : Type of class
 * @param <I> : Type of Id
 */
public interface IDao<T, I> {
    
    public void persist(T t);
    
    public void update(T t);
    
    public List<T> findAll();
    
    public T findById(I id);
    
    public void delete(I id);
}
