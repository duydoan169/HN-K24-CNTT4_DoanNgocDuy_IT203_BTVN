import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product>{
    ArrayList<Product> products = new ArrayList<>();

    HashMap<String, Product> hashMap = new HashMap<>();


    @Override
    public boolean add(Product item) {
        if (hashMap.get(item.getId()) == null){
            return false;
        }
        products.add(item);
        hashMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product target = hashMap.get(id);
        if(target == null){
            return false;
        }else {
            products.remove(target);
            hashMap.remove(id);
            return true;
        }
    }

    @Override
    public Product findById(String id) {
        Product target = hashMap.get(id);
        if(target == null){
            return null;
        }else {
            return target;
        }
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
