package exercici3u3;

public class Exercici3u3 {

    public static void main(String[] args) throws NumeroParamteresException, DoubleException, SegonParametreException {
        try {
            if (args.length != 2) {
                throw new NumeroParamteresException("Han d'arribar dos parametres!!");
            }
            double num1, num2;
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                throw new DoubleException("Els dos parametres han de ser de tipus: Double");
            }
            if(num2 == 0){
                throw new SegonParametreException("El segon parametre ha de ser diferent a 0");
            }
            System.out.println("Valor del primer parametre: " + num1 + ", valor del segon parametre: " + num2);
        } catch (NumeroParamteresException e) {
            System.err.println(e);
        } catch (DoubleException ex){
            System.err.println(ex);
        } catch (SegonParametreException exs){
            System.err.println(exs);
        }

    }

}
