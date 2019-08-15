package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void addCompany(Company company) {
        companyDao.save(company);
    }

    public void deleteCompany(int id) {
        companyDao.deleteById(id);
    }

    public List<Company> findCompaniesByFragment(String partOfTheName) {
        List<Company> companies = companyDao.retrieveCompanyByPartOfTheName(partOfTheName);
        if(companies.size() == 0) {
            LOGGER.info("There is no company with part of the name \"" + partOfTheName + "\"!");
            return companies;
        }
        LOGGER.info("Searching companies with part of the name \"" + partOfTheName + "\" was ended");
        return companies;
    }

    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeDao.deleteById(id);
    }

    public List<Employee> findEmployeesByFragment(String partOfAName) {
        List<Employee> employees = employeeDao.retrieveEmployeeByPartOfAName(partOfAName);
        if(employees.size() == 0) {
            LOGGER.info("There is no employee with part of a name \"" + partOfAName + "\"!");
            return employees;
        }
        LOGGER.info("Searching employees with part of a name \"" + partOfAName + "\" was ended");
        return employees;
    }
}
