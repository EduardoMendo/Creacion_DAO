package org.efmb.facturacion.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
public class Factura {
	
	@Id
	@GeneratedValue(generator = "System-uuid")
	@Hidden
	@GenericGenerator(name = "System-uuid", strategy = "uuid")
	@Column(length = 32)
	String oid;
	
	@Column(length = 6)
	int numero;
	
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	@Required
	LocalDate fecha;
	
	@Stereotype("MEMO")
	String observaciones;
	
	
	
}
