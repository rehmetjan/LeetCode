package net.selte.leetcode.problems.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import net.selte.leetcode.vo.Person;
import net.selte.leetcode.vo.Student;

import java.util.Date;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
public class JsonParser {

    public static void main(String[] args) throws JsonProcessingException {
        JsonParser test = new JsonParser();
        Student student = test.getStudent();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonString);

        String jsonStringPerson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(test.getPerson());
        System.out.println(jsonStringPerson);

        Person person = objectMapper.readValue(jsonStringPerson, Person.class);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getStudents().getName());

    }

    private Student getStudent() {
        Student student = new Student();
        student.setName("William");
        student.setAge(40);
        return student;
    }

    private Person getPerson() {
        Person person = new Person();
        person.setName("Oscar");
        person.setAge(41);
        person.setBirth(new Date());
        person.setInterest(new String[]{"Music", "Programming"});
        person.setStudents(this.getStudent());
        return person;
    }

}
