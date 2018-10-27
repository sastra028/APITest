package com.api.test.APITest.service.impl;

import com.api.test.APITest.dao.TableA1DAO;
import com.api.test.APITest.repository.ApiRepositoryImpl;
import com.api.test.APITest.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepositoryImpl apiRepository;

    @Override
    public String getDataFromTableA1All() {
        List<TableA1DAO> tableA1DAOList = apiRepository.findAll();
        StringBuilder response = new StringBuilder();
        for (TableA1DAO tableA1DAO : tableA1DAOList) {
            response.append(tableA1DAO.getId() +"," +tableA1DAO.getName()+"," +tableA1DAO.getLastName());
        }
        return response.toString();
    }

//    String getDataFromTableA1(){
//        List<TableA1DAO> tableA1DAOList = apiRepository.findAll();
//        StringBuilder response = new StringBuilder();
//        for (TableA1DAO tableA1DAO : tableA1DAOList) {
//            response.append(tableA1DAO.getId() +"," +tableA1DAO.getName()+"," +tableA1DAO.getLastname());
//        }
//        return response.toString();
//    }
}
