package org.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.model.StudentInformation;
import org.student.repository.StudentInformationRepository;

import java.util.List;

@Service
public class StudentInformationService implements IStudentInformationService {

@Autowired
    private StudentInformationRepository studentInformationRepository;


    @Override
    public List<StudentInformation> findAll() {

        List<StudentInformation>  studentInformations = (List<StudentInformation>) studentInformationRepository.findAll();

        return studentInformations;
    }
}
