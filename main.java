package com.company;
import com.company.models.Cours;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileReader("resourses\\application.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(properties.getProperty("db.driver"));
        config.setJdbcUrl(properties.getProperty("db.url"));
        config.setUsername(properties.getProperty("db.user"));
        config.setPassword(properties.getProperty("db.password"));
        config.setMaximumPoolSize(Integer.parseInt(properties.getProperty("db.hikari.pool-size")));

        DataSource dataSource = new HikariDataSource(config);

        CoursesRepository coursesRepository = new CoursesRepositoryJdbcTemplateImpl(dataSource);
        System.out.println(coursesRepository.findById(1));
        System.out.println(coursesRepository.findByName("Java"));
        Cours newCours=new Cours("Новыйкурс", "12.12.2021", "12.12.2022");
        coursesRepository.save(newCours);

    }
}
