public class Librarian extends User implements iLibrarian, iAdministrator{
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook() {
        System.out.println("Библиотекарь заказал книгу");
    }

    @Override
    public void findBook() {
        System.out.println("Библиотекарь нашел книгу");
    }

    @Override
    public void overdueNotification(User librarian) {
        System.out.println("Библиотекарь уведомил пользователя - " + getName());
    }
}

