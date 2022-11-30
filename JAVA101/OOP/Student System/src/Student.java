public class Student {
    Course c1y;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1y, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1y = c1y;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1y,int verbal1,int verbal2,int verbal3, int note2, int note3) {
        if (note1y >= 0 && note1y <= 100) {
            c1y.Grade = note1y;

        }
        if (verbal1 >= 0 && verbal1 <= 100) {
            c1y.verbal = verbal1;

        }
        if (verbal2 >= 0 && verbal2 <= 100) {
            c1y.verbal = verbal2;

        }
        if (verbal3 >= 0 && verbal3 <= 100) {
            c1y.verbal = verbal3;

        }

        if (note2 >= 0 && note2 <= 100) {
            c2.Grade = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.Grade = note3;
        }
    }
    void isPass(){
        this.average = ((this.c1y.Grade*0.80)+(this.c1y.verbal*0.20)+(this.c2.Grade*0.80)+(this.c2.verbal*0.20)+(this.c3.Grade*0.80)+(this.c3.verbal*0.20))/3;
        if(this.average>50){
            this.isPass = true;
            System.out.println("Congratulations " + this.name+" you passed");
            }else{System.out.println("You failed :(");
        }
        printNote(); //burda neden değeri doğru veriyor ki videoda aynılar
    }
    void printStudent(){
        System.out.println("Student's name: "+ this.name);
        System.out.println("Student's Number: "+ this.stuNo);
        System.out.println("Student's class: "+ this.classes);
    }

    void printNote() {
        System.out.println(this.c1y.name + " Grade: " + ((this.c1y.Grade*0.80)+(this.c1y.verbal*0.20)));
        System.out.println(this.c2.name + " Grade: " + ((this.c2.Grade*0.80)+(this.c2.verbal*0.20)));
        System.out.println(this.c3.name + " Grade: " + ((this.c3.Grade*0.80)+(this.c3.verbal*0.20)));
        System.out.println("your average grade is " + this.average ); //burda neden 0.0
    }
}


