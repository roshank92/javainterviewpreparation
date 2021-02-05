package com.brighttechbits.garbagecollector.employeewithgc;


class Employee
{
    private int ID;
    private String name;
    private int age;
    private static int nextId=1;
    //it is made static because it
    // is keep common among all and
    // shared by all objects
    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println
                ("Id="+ID+"\nName="+name+"\nAge="+age);
    }
    public void showNextId()
    {
        System.out.println
                ("Next employee id will be="+nextId);
    }
    protected void finalize()
    {
        System.out.println("GC gonna destroy this object");
        --nextId;
        //In this case,
        //gc will call finalize()
        //for 2 times for 2 objects.
    }
}

// it is closing brace of Employee class
class EmployeeWithGC
{
    public static void main(String []args)
    {
        Employee E=new Employee("BTB1",11);
        Employee F=new Employee("BTB2",22);
        Employee G=new Employee("BTB3",33);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        {
            //It is sub block to keep
            // all those interns.
            Employee X=new Employee("BTB4",44);
            Employee Y=new Employee("BTB5",55);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}

