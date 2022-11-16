class Ex2 {
    public Ex2(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public static void assertValue(Ex2 p1, Ex2 p2){
        p1 = p2;
        p1.setId(3);
        System.out.println(p1.getId());
        System.out.println(p2.getId());
    }

    public static void main(String[] args) {
        Ex2 p1 = new Ex2(2);
        Ex2 p2 = new Ex2(7);
        assertValue(p1,p2);
        System.out.println(p1.getId());
        System.out.println(p2.getId());
    }
}





