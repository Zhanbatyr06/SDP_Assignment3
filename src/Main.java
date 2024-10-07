
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
    public static void main(String[] args) {

        //Task 1
        LegacyOrderProcessor legacyOrderProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyOrderProcessor);
        adapter.processNewOrder();

        //Task 2
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);

        circle.draw();
        square.draw();

        //Task 3
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");

        dir1.addComponent(file1);
        dir2.addComponent(file2);
        dir1.addComponent(dir2);

        dir1.showDetails();

        //Task 4
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);
        System.out.println(plainText.write()); // Output: This is plain text.
        System.out.println(boldText.write()); // Output: <b>This is plain text.</b>
        System.out.println(italicBoldText.write()); // Output: <i><b>This is plain text.</b></i>


        //Task 5
        BankFacade bankFacade = new BankFacade();
        bankFacade.performBankOperations(); // Simplified access to banking operations

        //Task 6
        private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100);
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    //Task 7
    BankAccount authorizedAccount = new BankAccountProxy("authorizedUser");
    authorizedAccount.accessAccount(); // Access granted
    BankAccount unauthorizedAccount = new BankAccountProxy("unauthorizedUser");
    unauthorizedAccount.accessAccount(); // Access denied
    }
