package Behavioral.Memento;

public class MementoInstance {
    void main(){
        Editor editor = new Editor();
        editor.write("Like and");
        editor.write("Like and subscribe");
        editor.write("Like, Subscribe Mistake!!");

        editor.undo();
    }
}
