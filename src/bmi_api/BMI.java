package bmi_api;

public class BMI {

    private double waga;
    private double wzrost;
    private double bmi;

    public BMI() {

    }

    public BMI(double waga, double wzrost, double bmi) {
        this.waga = waga;
        this.wzrost = wzrost;
        this.bmi = bmi;
    }

    public double getBmi() {
        return bmi;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public double PrzeliczCentymetryNaMetry(double wzrost_m) {
        return wzrost_m / 100;
    }

    public double DokonajZaokragleniaLiczby(double liczba, int dokładnosc) {
        liczba *= 10 ^ dokładnosc;
        liczba = Math.round(liczba);
        return (liczba / (10 ^ dokładnosc));

    }

    public void ObliczBMI(double waga_człowieka, double wzrost_człowieka) {
        double wzrost_w_metrach = PrzeliczCentymetryNaMetry(wzrost_człowieka);
        double bmiDokładnaWartość = waga_człowieka / (wzrost_w_metrach * wzrost_w_metrach);
        bmi = DokonajZaokragleniaLiczby(bmiDokładnaWartość, 2);
    }

    public String DokonajInterpretacjiWyniku() {
        if (bmi < 18.5) {
            return "Masz niedowagę !!!";

        } else if ((24.9 >= bmi) && ((18.5 <= bmi))) {
            return "Prawidłowa masa ciała !!!";

        } else if ((29.9 >= bmi) && ((25.0 <= bmi))) {
            return "Nadwaga !!!";

        } else if ((34.9 >= bmi) && ((30.0 <= bmi))) {
            return "Otyłość I stopnia !!!";

        } else if ((39.9 >= bmi) && ((35.0 <= bmi))) {
            return "Otyłość II stopnia  !!!";

        } else {
            return "Otyłość III stopnia   !!!";
        }
    }
}
