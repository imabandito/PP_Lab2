package com.mainPackage;

import com.studentPackage.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static <var> void main(String[] args) {
        String path = "C:\\Users\\ilkop\\IdeaProjects\\PP_Lab2\\src\\com\\mainPackage\\studentslist.txt";
        List<Student> studentList = readStudentsFromFile(path);
        printStudents(studentList);
        printStudentsByFaculty(studentList,"LAW");
        printStudentsByGroup(studentList,"lol-911");
        printStudentsFromYear(studentList,2011);
    }

    public static List<Student> readStudentsFromFile(String path)
    {
        List<Student> studentList = new LinkedList<>();
        String dateStr;
        String tmp;
        int i = 0;
        try {

            Student st1 = new Student();
            Scanner sc = new Scanner(new File(path));
            sc.useDelimiter(",|\n");
            String str;
            int id;
            while (sc.hasNext()) {
                studentList.add(new Student());
                studentList.get(i).setId(Integer.parseInt(sc.next().trim()));
                studentList.get(i).setName(sc.next());
                studentList.get(i).setSurname(sc.next());
                studentList.get(i).setFatherName(sc.next());

                dateStr = sc.next();
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(dateStr);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);

                studentList.get(i).setDateOfBirth(calendar);
                studentList.get(i).setAdress(sc.next());
                studentList.get(i).setPhone(Integer.parseInt(sc.next().trim()));
                studentList.get(i).setFaculty(sc.next().trim());
                studentList.get(i).setCourse(Integer.parseInt(sc.next().trim()));
                studentList.get(i).setGroup(sc.next().trim());
                i++;
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found, Stack trace:");
                e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getCause()+"\n"+e.getStackTrace());
            e.printStackTrace();
        }

        return studentList;
    }

    public static void printStudents(List<Student> list){
        System.out.println("All students:");
        for (Student student:list) {
            System.out.println(student);
        }
    }

    public static void printStudentsByFaculty(List<Student> list, String faculty){
        System.out.println("Students from faculty of "+faculty+":");
        for (Student student:list) {
            if(student.getFaculty().equals(faculty)){
                System.out.println(student);
            }
        }
    }

    public static void printStudentsFromYear(List<Student> list, int year){
        System.out.println("Students born after "+year+":");
        for (Student student:list) {
            if(student.getDateOfBirth().getWeekYear() >= year){
                System.out.println(student);
            }
        }
    }

    public static void printStudentsByGroup(List<Student> list, String group){
        System.out.println("Students from group "+group+":");
        for (Student student:list) {
            if(student.getGroup().equals(group)){
                System.out.println(student);
            }
        }
    }

    public static void addNewStudent(List<Student> list){
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        newStudent.setId(sc.nextInt());
        newStudent.setName(sc.nextLine());
        newStudent.setSurname(sc.nextLine());
        newStudent.setFatherName(sc.nextLine());
        newStudent.setDateOfBirth(stringToCalendar(sc.nextLine()));
        newStudent.setAdress(sc.next());
        newStudent.setPhone(sc.nextInt());
        newStudent.setFaculty(sc.next());

    }

    public static Calendar stringToCalendar(String dateStr) {
        Calendar calendar = new GregorianCalendar(0, 0 , 0);;
        try {

            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatter.parse(dateStr);
            calendar = Calendar.getInstance();
            calendar.setTime(date);
        }catch (ParseException parseException){
            System.out.println(parseException.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return calendar;
    }
    }
