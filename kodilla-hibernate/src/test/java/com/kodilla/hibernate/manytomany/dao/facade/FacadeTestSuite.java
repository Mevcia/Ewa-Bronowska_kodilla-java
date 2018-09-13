package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Facade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void shouldReturnListOfEmployees() {
        employeeDao.deleteAll();
//        Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Anna", "Góra");
        Employee employee3 = new Employee("Stefan", "Nowak");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

//        When
        List<Employee> employees = facade.findEmployee("owa");

//        CleanUp
        try {
            employeeDao.delete(employee1.getId());
            employeeDao.delete(employee2.getId());
            employeeDao.delete(employee3.getId());
        } catch (Exception e) {
//            do nothing
        }
//        Then
        Assert.assertEquals(2, employees.size());

    }

    @Test
    public void shouldReturnListOfCompanies() {
        companyDao.deleteAll();
//        Given
        Company company1 = new Company("Złota rybka");
        Company company2 = new Company("Kaczuszka");
        Company company3 = new Company("Malinowy Chruśniak");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

//        When
        List<Company> companies = facade.findCompany("r");

        try {
            companyDao.delete(company1.getId());
            companyDao.delete(company2.getId());
            companyDao.delete(company3.getId());
        } catch (Exception e) {
            //            do nothing
        }

//        Then
        Assert.assertEquals(2, companies.size());

//    CleanUp
    }
}