package circular_dependency.field_injecton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Autowired
    BeanA beanA;
}
