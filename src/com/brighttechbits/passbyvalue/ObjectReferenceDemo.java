package com.brighttechbits.passbyvalue;

class Student
{
    int age;
    Student(int age) { this.age = age; }
    Student()      { age = 0; }
}

class ObjectReferenceDemo
{
    public static void main(String[] args)
    {
        // s is a reference
        Student s = new Student(5);

        // Reference is passed and a copy of reference
        // is created in change()
        change(s);

        // Old value of s.age is printed
        System.out.println(s.age);
    }
    public static void change(Student s)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
       // s = new Student();

        s.age = 10;
    }
}
