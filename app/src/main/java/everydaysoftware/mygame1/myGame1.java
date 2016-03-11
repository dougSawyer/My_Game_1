package everydaysoftware.mygame1;

/**
 * Created by dsawyer on 3/10/2016.
 */
public class myGame1 {

    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

    private void DoSomething(String someValue){
        setMyProperty(someValue);
    }
}
