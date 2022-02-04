package io.javabrains.springbootquickstart.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootquickstart.topic.Topic;

@Entity
public class Course {
	//member variables
	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	//no argument constructor to make it easier to initialize the object
	public Course() {
	}
	
	//topic model object
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "","");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
	
	

}
