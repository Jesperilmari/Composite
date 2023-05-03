public class Charizard extends PokemonState {
    public void attack() {
        System.out.println("Charizard uses Fire Blast!");
        public void move () {
            System.out.println("Charizard flies around.");
        }
        @Override
        public void evolve () {
        }

        public void accept (PokemonVisitor visitor){
            visitor.visit(this);
        }
    }
}