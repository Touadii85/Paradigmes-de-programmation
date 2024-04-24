public abstract class DecorateurCafe extends Cafe{

    protected Cafe cafe;

    public DecorateurCafe(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public String description(){
        return this.cafe.description();
    }

    @Override
    public double cout(){
        return this.cafe.cout();
    }
}
