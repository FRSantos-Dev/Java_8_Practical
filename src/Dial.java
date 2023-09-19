package src;
import java.util.function.Consumer;

class Dial implements Consumer<User> {
    public void accept(User u){
        System.out.println(u.getName());
    }


}
