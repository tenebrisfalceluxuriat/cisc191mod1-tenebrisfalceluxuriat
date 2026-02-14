package edu.sdccd.cisc191;

/**
 * Module 1 - Part B
 * Student data model with validation.
 */
public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    /**
     * Validation rules:
     * - name must not be null or blank
     * - gpa must be in [0.0, 4.0]
     * - id must be > 0
     *
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Student(String name, double gpa, int id) {
        // TODO: validate and assign fields
        if(name ==null ||name.trim().isEmpty()){
            throw new IllegalArgumentException("nope");
        }
        if(gpa<0.0 || gpa>4.0){
            throw new IllegalArgumentException("nuh uh");
        }
        if(id<=0){
            throw new IllegalArgumentException("nah");
        }

       this.name=name;
        this.id=id;
        this.gpa=gpa;

    }

    public String getName() {
        return name;
    }

    public double getGpa() {
      return gpa;
    }

    public int getId() {
    return id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id+ ", name=" + name + ",gpa= " + gpa + "}";


    }
}
