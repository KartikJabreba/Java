public class Exception_Handling {
    public static void main(String[] args) throws Exception {
        try {
            int n=10/0;
        }
        catch (Exception e){
            return;
        }
        finally {
            return;
        }
    }
}
