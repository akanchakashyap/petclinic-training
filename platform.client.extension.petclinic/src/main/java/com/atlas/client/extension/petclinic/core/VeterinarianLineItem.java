package com.atlas.client.extension.petclinic.core;

import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.Executions.Configs;
import com.antheminc.oss.nimbus.domain.defn.MapsTo;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Path;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.GridColumn;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Link;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Rakesh Patel
 *
 */

@MapsTo.Type(Veterinarian.class)
@Getter @Setter
public class VeterinarianLineItem {
	
	@Path @GridColumn(hidden=true)
	private Long id;
	
	@Path @GridColumn
	@Label("First Name")
	private String firstName;
	
	@Path @GridColumn
	@Label("Last Name")
	private String lastName;
	
//	@Path
//	private String specialty;
	
	@Configs({
		@Config(url="/p/veterinarianview:<!/id!>/_get")
	})
	@Link(imgSrc="edit.png")
	private String edit;

}