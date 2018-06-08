package com.atlas.client.extension.petclinic.core;

import java.time.LocalDate;

import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.Executions.Configs;
import com.antheminc.oss.nimbus.domain.defn.MapsTo;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Path;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.GridColumn;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Link;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.LinkMenu;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.atlas.client.extension.petclinic.core.OwnerLineItem.VLMCaseItemLinks;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Sandeep Mantha
 *
 */

@MapsTo.Type(Visit.class)
@Getter @Setter
public class VisitLineItem {
	
	@Path @GridColumn(hidden=true)
	private Long id;
	
	@Path @GridColumn
	@Label("Appointment")
	private LocalDate appointment;
	
	@Path @GridColumn
	@Label("Reason For Visit")
	private String reasonForVisit;
	
//	@Path(value="/p/veterinarianview:<!/.m/vetId!>/vpAddEditVeterenarian/vtAddEditVeterinarian/vsAddEditVeterinarian/vfAddEditVeterinarian/fullName/_get", linked=false, detachedState=@DetachedState(loadState=LoadState.AUTO))
//	private String vetName;
	
	@Path @GridColumn
	@Label("Status")
	private String status;
	
    @LinkMenu
    private VLMVisitItemLinks vlmVisitItemLinks;
   
    @Model
    @Getter @Setter
    public static class VLMVisitItemLinks {
        @Config(url="/p/petassessmentview/_new")
        @Link(imgSrc="edit.png") @Label("Pet Questionnaire") private String petQuestionnaire;
        
    }

}
