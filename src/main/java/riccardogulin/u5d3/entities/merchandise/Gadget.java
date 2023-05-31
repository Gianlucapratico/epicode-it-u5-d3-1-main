package riccardogulin.u5d3.entities.merchandise;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import riccardogulin.u5d3.entities.Product;

@Component
@Scope("singleton")
@Getter
@Setter
@AllArgsConstructor
public class Gadget extends Product {
	String type;
}
