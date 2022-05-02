/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import beans.Config;
import beans.Student;

/**
 *
 * @author User
 */
public class StudentUtil {

    public static Student studentRegister() {
        int registerNumber = InputUtil.requireNumber("How many students do you registration?");
        Config.students = new Student[registerNumber];
        for (int i = 0; i < registerNumber; i++) {
            System.out.println((i + 1) + ".Registered Student");
            String name = InputUtil.requireText("Enter name");
            String surname = InputUtil.requireText("Enter surname");
            String className = InputUtil.requireText("Enter Classname");
            int age = InputUtil.requireNumber("Enter age");
            Student st = new Student(name, surname, className, age);
            Config.students[i] = st;
        }
        return null;
    }

    public static Student showAllStudents() {
        System.out.println("Registered Students.");
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1)+". "+st.getName() + " " + st.getSurname() + " " + st.getClassName() + " " + st.getAge());
        }
        return null;
    }

    public static Student[] findStudent() {
        int a = 0;
        String text = InputUtil.requireText("Find for name or surname or Class");
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                System.out.println(st.name + " " + st.surname + " " + st.className + " " + st.age);
            }

        }
        return null;
    }

    public static Student updateStudent() {
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1) + "." + st.getName() + " " + st.getSurname() + " " + st.getClassName() + " " + st.getAge());
        }
        int a = InputUtil.requireNumber("Which student  do you want change? ");
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        String className = InputUtil.requireText("Enter Classname");
        int age = InputUtil.requireNumber("Enter age");
        Student st = new Student(name, surname, className, age);
        Config.students[a-1] = st;
        return null;
    }
}
