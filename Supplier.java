public class Supplier implements iSupplier, iReader{
    @Override
    public void bringBook() {
        System.out.println("Поставщик попросил книги в библиотеку");
    }

    @Override
    public void takeBook() {
        System.out.println("Поставщик взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Поставщик сделал возврат книги");
    }
}

