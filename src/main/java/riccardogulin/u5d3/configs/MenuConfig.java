package riccardogulin.u5d3.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import riccardogulin.u5d3.entities.Consummation;
import riccardogulin.u5d3.entities.Menu;
import riccardogulin.u5d3.entities.drinks.Coke;
import riccardogulin.u5d3.entities.drinks.Lemonade;
import riccardogulin.u5d3.entities.pizzas.Pizza;
import riccardogulin.u5d3.entities.toppings.HamTopping;
import riccardogulin.u5d3.entities.toppings.OnionTopping;

@Configuration
public class MenuConfig {
	@Bean
	Menu getMenu() {
		Menu menu = new Menu();

		menu.getMenuEntries().add(getMargherita());
		menu.getMenuEntries().add(getPizzaProsciutto());
		menu.getMenuEntries().add(getPizzaCipolla());
		menu.getMenuEntries().add(getPizzaProsciuttoCipolla());
		menu.getMenuEntries().add(getCoke());
		menu.getMenuEntries().add(getLemonade());

		return menu;
	}

	@Bean
	@Scope("prototype")
	Consummation getMargherita() {
		return new Pizza();
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciutto() {
		return new HamTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaCipolla() {
		return new OnionTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciuttoCipolla() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean
	@Scope("prototype")
	Consummation getCoke() {
		return new Coke(0.5);
	}

	@Bean
	@Scope("prototype")
	Consummation getLemonade() {
		return new Lemonade(0.5);
	}

}
