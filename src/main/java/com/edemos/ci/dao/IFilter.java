/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edemos.ci.dao;

import java.util.Date;
import java.util.List;

/**
 *
 * @author edemos
 */
public interface IFilter<T> {
    
    public List<T> filterByLabel(String text);
    
    public List<T> filterByDate(Date date);
    
    public List<T> filterById(Integer id);
}
