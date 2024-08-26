package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Qual seu nome: ");
        student.name = scn.nextLine();
        System.out.println("Qual sua primeira nota: ");
        student.nota1 = scn.nextDouble();
        System.out.println("Qual sua segunda nota: ");
        student.nota2 = scn.nextDouble();
        System.out.println("Qual sua terceira nota: ");
        student.nota3 = scn.nextDouble();
        student.retornoFinalNota();



        scn.close();
        }




    }


