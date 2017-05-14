
package Service;
import java.util.List;
import Entity.Guitar;
public interface GuitarService {
    void addGuitar(Guitar entity);
    List<Guitar> queryallGuitar(String hql);
}