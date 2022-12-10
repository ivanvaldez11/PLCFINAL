public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.print("Enter the name of file: ");
        String fileName = scam.next();
        File folder = new File(fileName);
        Compiler object = new Compiler();
        String enter = object.convertFile(folder);
        System.out.println("File Content is as follow: " + enter);
        scam.close();
    }
}