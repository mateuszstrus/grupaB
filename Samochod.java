public class Samochod {
    public void main(String args[]) {
        Zaplon zaplon = new Zaplon("");
        zaplon.setKey("false");

        if(zaplon.getKey() == "false")
        {
            System.out.println("Zaplon wyłączony");
        }else
        {
            System.out.println("Zaplon włączony");
        }

        Check_engine engine = new Check_engine(0);
        engine.setSales(8500.4564);

        if(engine.getSales() <= 0){
            System.out.println("Silnik nie jest włączony - brak obrotów");
        }else if(engine.getSales() > 0 && engine.getSales() <= 6999.999)
        {
            System.out.println("Silnik działa poprawnie");
        }else
        {
            System.out.println("Zbyt wysokie obroty - awaria silnika");
        }

    }

}
