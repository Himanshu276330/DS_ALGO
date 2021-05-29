package Practice_SET.GRAPH_SERIES_01;

public class Pair_With_Generics<E> {
    E first;
    E second;
    private Pair_With_Generics(){}
    Pair_With_Generics(E first,E second){
        this.first=first;
        this.second=second;
    }
}
