package com.example.Task1.service;

import com.example.Task1.helper.ExcelHelper;
import com.example.Task1.model.Tutorial;
import com.example.Task1.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    TutorialRepository repository;

    public ByteArrayInputStream load() {
        List<Tutorial> tutorials = repository.findAll();

        ByteArrayInputStream in = ExcelHelper.tutorialsToExcel(tutorials);
        return in;
    }


}
