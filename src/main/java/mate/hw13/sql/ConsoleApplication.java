package mate.hw13.sql;

public class ConsoleApplication {

    public static void main(String[] args) {
        CrudOperations operations = new CrudOperations();
        operations.deleteOperation();
        operations.createOperation();
        operations.readOperation();
        operations.updateOperation();
    }
}
