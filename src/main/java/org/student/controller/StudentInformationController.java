package org.student.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.student.model.StudentInformation;
import org.student.service.IStudentInformationService;

import org.student.model.StudentInformationView;
import org.student.service.IStudentInformationViewService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentInformationController {

    public static final Logger logger = LoggerFactory.getLogger(StudentInformationController.class);

    @Autowired
    private IStudentInformationService studentInformationService;

    @Autowired
    private IStudentInformationViewService studentInformationViewService;


    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<StudentInformation>> listAllStudents()
    {
        List<StudentInformation> studentInformations = studentInformationService.findAll();

        if(studentInformations.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<StudentInformation>>(studentInformations, HttpStatus.OK);

    }

    @RequestMapping(value = "/studentsview", method = RequestMethod.GET)
    public ResponseEntity<List<StudentInformationView>> listAllStudentsView()
    {
        List<StudentInformationView> studentInformations = studentInformationViewService.findAll();

        if(studentInformations.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<StudentInformationView>>(studentInformations, HttpStatus.OK);

    }


}
