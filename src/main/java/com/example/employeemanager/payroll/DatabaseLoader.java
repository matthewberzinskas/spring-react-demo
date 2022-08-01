package com.example.employeemanager.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repo;

    @Autowired
    public DatabaseLoader (EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repo.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
