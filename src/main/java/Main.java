import ru.netology.javaqa.javaqamvn.servises.CalcService;

public class Main {

    public static void main(String[] args) {
        CalcService service = new CalcService();

        int calculate = service.calculate(100000, 60000, 150000);

        System.out.println(calculate + " месяца(ев) отдыха");

    }
}
