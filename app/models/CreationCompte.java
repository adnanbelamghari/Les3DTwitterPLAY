package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.data.validation.Constraints.Required;
import play.data.validation.Constraints.Min;
import play.db.ebean.Model;
import play.api.libs.json.*;

@Entity
public class CreationCompte extends Model 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Required
	private String label;

	@Required
	@Min(0)
	private Integer priority;

	

	

	public Long getId()
	{
		return id ;
	}

	public void setId(Long _id)
	{
		id = _id ;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String _label)
	{
		label = _label ;
	}

	public Integer getPriority()
	{
		return priority ;
	}

	public void setPriority(Integer _priority)
	{
		priority = _priority ;
	}

	public static Finder<Long,CreationCompte> find = new Finder( Long.class, CreationCompte.class );

	public static List<CreationCompte> findAll() 
	{
		return find.all();
	}

	public static void create(CreationCompte creationCompte) 
	{
		creationCompte.save();
	}

	public static void delete(Long id) 
	{
		find.ref(id).delete();
	}

	



}
