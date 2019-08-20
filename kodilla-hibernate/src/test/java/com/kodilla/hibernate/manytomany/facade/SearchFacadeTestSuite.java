package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testFindCompaniesByFragment() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Future Software");
        Company greyMatter = new Company("Grey Matter");

        searchFacade.addCompany(softwareMachine);
        searchFacade.addCompany(dataMaesters);
        searchFacade.addCompany(greyMatter);

        //When
        List<Company> companies = searchFacade.findCompaniesByFragment("sof");

        //Then
        assertEquals(2, companies.size());

        //Clean up
        try {
            searchFacade.deleteCompany(softwareMachine.getId());
            searchFacade.deleteCompany(dataMaesters.getId());
            searchFacade.deleteCompany(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompaniesByFragmentWhereNoCompany() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        searchFacade.addCompany(softwareMachine);
        searchFacade.addCompany(dataMaesters);
        searchFacade.addCompany(greyMatter);

        //When
        List<Company> companies = searchFacade.findCompaniesByFragment("alf");

        //Then
        assertEquals(0, companies.size());

        //CleanUp
        try {
            searchFacade.deleteCompany(softwareMachine.getId());
            searchFacade.deleteCompany(dataMaesters.getId());
            searchFacade.deleteCompany(greyMatter.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployeesByFragment() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee claraSmith = new Employee("Clara", "Smith");

        searchFacade.addEmployee(johnSmith);
        searchFacade.addEmployee(stephanieClarckson);
        searchFacade.addEmployee(lindaKovalsky);
        searchFacade.addEmployee(claraSmith);

        //When
        List<Employee> employees = searchFacade.findEmployeesByFragment("cl");

        //Then
        assertEquals(2, employees.size());

        //CleanUp
        try {
            searchFacade.deleteEmployee(johnSmith.getId());
            searchFacade.deleteEmployee(stephanieClarckson.getId());
            searchFacade.deleteEmployee(lindaKovalsky.getId());
            searchFacade.deleteEmployee(claraSmith.getId());
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployeesByFragmentWhereNoEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee robertSmith = new Employee("Robert", "Smith");

        searchFacade.addEmployee(johnSmith);
        searchFacade.addEmployee(stephanieClarckson);
        searchFacade.addEmployee(lindaKovalsky);
        searchFacade.addEmployee(robertSmith);

        //When
        List<Employee> employees = searchFacade.findEmployeesByFragment("ma");

        //Then
        assertEquals(0, employees.size());

        //CleanUp
        try {
            searchFacade.deleteEmployee(johnSmith.getId());
            searchFacade.deleteEmployee(stephanieClarckson.getId());
            searchFacade.deleteEmployee(lindaKovalsky.getId());
            searchFacade.deleteEmployee(robertSmith.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}