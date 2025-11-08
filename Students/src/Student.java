public class Student{
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major){
        setAge(age);
        setName(name);
        setMajor(major);
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getMajor(){
       return major;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString(){
        return name.concat(" ").concat(age+" ").concat(major);
    }
}