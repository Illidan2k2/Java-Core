public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println(devide(2, 0));
        } catch (HoangException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int devide(int a, int b) throws HoangException {
        if (b == 0) throw new HoangException("B khong hop le");
        return a/b;
    }
}

class HoangException extends Exception {
    HoangException(String message) {
        super("Hoang nem ra exception " + message);
    }
}
