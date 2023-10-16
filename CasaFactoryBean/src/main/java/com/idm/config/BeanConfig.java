package com.idm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.idm.casa.CasaCampagna;
import com.idm.casa.Creator;
import com.idm.casa.Giardino;
import com.idm.casa.Terrazzo;

@Configuration
public class BeanConfig {
	
	@Bean(name = "creator")
	public Creator getCreator() {
		System.out.println("Creator creato tramite un bean");
		return new Creator();
	}
	
	@Bean(name = "giardino")
	@Scope("prototype")
	public Giardino getGiardino() {
		System.out.println("ho creato un giardino bean");
		return new Giardino(3);
	}
	
	@Bean(name = "terrazzo")
	@Scope("prototype")
	public Terrazzo getTerrazzo() {
		System.out.println("ho creato un terrazzo bean");
		return new Terrazzo(false);
	}

}
