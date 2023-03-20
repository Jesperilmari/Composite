class Arvaus {
    private int arvaus;

    public void Arvuuttaja(int arvaus){
        this.arvaus = arvaus;
    }
    public Memento takeSnapshot(){
        return new Memento(this.arvaus);
    }
    public void restore(Memento memento){
        this.arvaus = memento.getSavedArvaus();
    }

    private static class Memento{
        private final int arvaus;

        private Memento(int arvausToSave){
            arvaus = arvausToSave;
        }
        private int getSavedArvaus(){
            return arvaus;
        }
    }

}
