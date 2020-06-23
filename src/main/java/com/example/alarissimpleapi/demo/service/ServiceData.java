package com.example.alarissimpleapi.demo.service;

import com.example.alarissimpleapi.demo.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@Component
@Slf4j
public class ServiceData {

    static final String FILE = "/tmp/inputstuff";

    public Data getData() throws IOException {
        Data data = new Data();
        data.setDate(new Date());
        data.setTime(new Date());
        data.setRows(readFile());
        return data;
    }

    public String readFile() throws IOException {
        String rows = "";
        try {
            rows = String.valueOf(Files.readAllLines(Paths.get(FILE)).size());
        } catch (IOException e) {
           log.error("\n\n Возникла ошибка при чтении файла по пути {} {}", FILE, e.getMessage());
           rows = String.format("Возникла ошибка при чтении файла по пути %s %s", FILE, e.getMessage());
        }
        return rows;
    }
}
