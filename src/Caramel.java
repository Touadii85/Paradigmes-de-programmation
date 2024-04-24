public class Caramel extends DecorateurCafe{
    public Caramel(Cafe cafe) {

        super(cafe);
    }

    @Override
    public String description(){

        return cafe.description() + " Caramel";
    }

    @Override
    public double cout(){

        return cafe.cout() + 0.9;
    }
}
