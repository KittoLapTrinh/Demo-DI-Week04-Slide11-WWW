package vn.edu.iuh.fit.models;

public class Student {
   private long id;
   private String name;
   private Class_ lophoc;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lophoc=" + lophoc +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class_ getLophoc() {
        return lophoc;
    }

    public void setLophoc(Class_ lophoc) {
        this.lophoc = lophoc;
    }

    public Student(long id, String name, Class_ lophoc) {
        this.id = id;
        this.name = name;
        this.lophoc = lophoc;
    }

    public void show() {
        System.out.println(id + " " + name);
        System.out.println(lophoc.toString());
    }
}
