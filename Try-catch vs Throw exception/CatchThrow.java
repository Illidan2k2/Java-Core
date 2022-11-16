public class CatchThrow {
    // Throw an error to pass to the calling code
    private static void ThrowMethods() throws NumberFormatException{
        String intNumber = "9";
        int n = Integer.parseInt(intNumber);

        System.out.println("Converting completed with n!");
    }
    // Handling the thrown exception
    private static void CatchMethod(){
        try{
            ThrowMethods();
        } catch (NumberFormatException ex){
            System.out.println("Conversion error!");
        } finally {
            System.out.println("The code still run!");
        }

    }
    public static void main(String[] args) {
        CatchMethod();
    }
}
