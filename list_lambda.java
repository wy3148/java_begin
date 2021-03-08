
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Resource {

    private Object val = new ArrayList();
    
    public Resource(){

    }

    public void setCar(Car c){
        c.name("testing");
    }

    public void runTest(){

        List<Car> all = Arrays.asList(new Car("subura"), new Car("toyta"));
        List<Car> suburaCars = all.stream().filter(car->car.getName().equals("subura")).collect(Collectors.toList());

        suburaCars.forEach(c->{
            System.out.println(c.getName()) ;
        });

    }
}