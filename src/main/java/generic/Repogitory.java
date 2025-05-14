package generic;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repogitory<T> {
    private List<T> list;

    public Repogitory(){
        list = new ArrayList<>();
    }

    public T save(T t) {
        list.add(t);
        return t;
    }


    public List<T> findAll(){
        return list;
    }

}
