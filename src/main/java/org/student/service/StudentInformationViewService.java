package org.student.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.model.StudentInformationView;
import org.student.repository.StudentInformationViewRepository;

import java.util.List;

@Service
public class StudentInformationViewService implements IStudentInformationViewService {

    @Autowired
    private StudentInformationViewRepository studentInformationRepository;


    @Override
    public List<StudentInformationView> findAll() {

        List<StudentInformationView>  studentInformations = (List<StudentInformationView>) studentInformationRepository.findAll();

        return studentInformations;
    }
}
