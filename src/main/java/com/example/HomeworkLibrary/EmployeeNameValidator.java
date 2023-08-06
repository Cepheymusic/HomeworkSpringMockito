package com.example.HomeworkLibrary;

import org.apache.commons.lang3.StringUtils;

public class EmployeeNameValidator {
    public static void checkName(String... names) throws IllegalNameException {
        for (String name : names) {
            if (!StringUtils.isAlpha(name)) {
                throw new IllegalNameException();
            }
        }
    }
}
