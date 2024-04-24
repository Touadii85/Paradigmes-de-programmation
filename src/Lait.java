public class Lait extends DecorateurCafe{
    public Lait(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String description(){
        return cafe.description() + " Lait";
    }

    @Override
    public double cout(){
        return cafe.cout() + 0.8;
    }
}
