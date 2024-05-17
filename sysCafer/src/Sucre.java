public class Sucre extends DecorateurCafe{// class décorateur cafer
    public Sucre(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String description(){
        return cafe.description() + " Sucre";
    }

    @Override
    public double cout(){
        return cafe.cout() + 0.5;
    }
}
