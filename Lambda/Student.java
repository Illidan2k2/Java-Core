/*class Student {
    public Student(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    private School school;

}

class School{

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}

class Program1{
    public static void main(String[] args) {
        School school = new School("Hogwart");
        Pupil student = new Pupil(school);

        Identity identity = (Pupil n) -> n.getSchool().getName();

        System.out.println(identity.getDetail(student));
    }
}

@FunctionalInterface
interface Identity{
    String getDetail(Pupil n);
}*/
