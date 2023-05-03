public interface Pokemon {
    void attack();
    void move();
    void evolve();
    void accept(PokemonVisitor visitor);
}
