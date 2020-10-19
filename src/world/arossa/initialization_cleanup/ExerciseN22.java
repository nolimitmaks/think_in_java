package world.arossa.initialization_cleanup;
import static world.arossa.helpers.Print.*;


public class ExerciseN22 {
    ExerciseN21 element;
    public ExerciseN22 (ExerciseN21 element) {
        this.element = element;

        this.showInfo();
    }

    private void showInfo() {
print(element.toString());
        switch (element) {
            case CHF:
                print("case CHF");
                break;
            case GBP:
                print("case GBP");
                break;
            case EURO:
                print("case EURO");
                break;
            case JPN:
                print("case JPN");
                break;
            case PLZ:
                print("case PLZ");
                break;
            case UAH:
                print("case UAH");
                break;
            case USD:
                print("case USD");
                break;
        }
    }
}
