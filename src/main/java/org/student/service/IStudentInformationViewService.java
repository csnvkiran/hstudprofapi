package org.student.service;

import org.student.model.StudentInformationView;

import java.util.List;

public interface IStudentInformationViewService {

    public List<StudentInformationView> findAll();
}