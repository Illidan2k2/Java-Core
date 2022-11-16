public class Pupil {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id=1;
    public static void main(String[] args) {
        final Pupil pupil = new Pupil();
        System.out.println(pupil.id);
        pupil.setId(3);
        System.out.println(pupil.id);
    }
}