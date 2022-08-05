import javafx.scene.Parent
import org.testng.annotations.Factory

class factory {

    ArrayList<Object> objectlist = new ArrayList<>()
    @Factory
    Object[] factorymethod(){
    objectlist.add(new ParentTest())

return objectlist
    }
}
