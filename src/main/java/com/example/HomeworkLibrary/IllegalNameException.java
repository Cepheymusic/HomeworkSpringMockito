package com.example.HomeworkLibrary;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "В имени должны быть только буквы")
public class IllegalNameException extends IllegalAccessException{
}