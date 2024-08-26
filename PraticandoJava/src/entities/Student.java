package entities;

public class Student {
             public String name;
             public double nota1;
             public double nota2;
             public double nota3;

             public double retornoDaNota(){
                    return nota1 + nota2 + nota3;
             }
             public double notaQueFalto(){
                    return 60.0 - retornoDaNota();
             }
             public void retornoFinalNota(){
                  if (retornoDaNota()>60.0){
                     System.out.println("Final grade = " + retornoDaNota());
                     System.out.println("Pass");
                 } else {
                     System.out.println("Final grade = " + retornoDaNota());
                     System.out.println("Failed");
                     System.out.println("Missing " + notaQueFalto() + " Points");
                 }
             }
       }



