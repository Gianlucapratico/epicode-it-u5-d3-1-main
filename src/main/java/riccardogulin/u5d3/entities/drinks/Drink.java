package riccardogulin.u5d3.entities.drinks;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import riccardogulin.u5d3.entities.Consummation;

@Component
@Scope("singleton")
@AllArgsConstructor
@Getter
@Setter
public abstract class Drink extends Consummation {
	double size;

	@Override
	public String toString() {
		return this.getName() + " " + this.getSize() + ", prezzo: " + this.getPrice() + "€, calorie:"
				+ this.getCalories();
	}
}
