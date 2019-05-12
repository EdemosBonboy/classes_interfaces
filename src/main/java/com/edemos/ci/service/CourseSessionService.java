/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edemos.ci.service;

import com.edemos.ci.dao.IDao;
import com.edemos.ci.entity.CourseSession;
import java.util.List;

/**
 *
 * @author edemos
 */
public class CourseSessionService implements IDao<CourseSession, Integer> {

    @Override
    public void persist(CourseSession t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CourseSession t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CourseSession> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CourseSession findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<CourseSession> findAllFuture() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
