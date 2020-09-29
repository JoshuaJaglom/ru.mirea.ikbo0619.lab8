package com.company;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\62382\\IdeaProjects\\ru.mirea.ikbo0619.lab8\\Java.txt";
        try(FileWriter writer = new FileWriter(path, true))
        {
            Scanner sc = new Scanner(System.in);
            writer.write(sc.nextLine());
            System.out.println("Запись завершена");
        }
    }
}
