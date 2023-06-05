public class UpdatingVar {
    public static void main(String[] args) {
        int salary = 1000;

        // bono 200

        salary = salary + 200;
        System.out.println(salary);

        //pension osea descuento de 50
        salary= salary - 50;
        System.out.println(salary);

        //Actualizar cadenas de texto

        String employeeName = "Erick Santiago";
        employeeName = employeeName + " Gallo Buriticá";
        System.out.println(employeeName);
    }
}

