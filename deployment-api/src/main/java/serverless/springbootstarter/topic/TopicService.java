package serverless.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private  List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring framework", "Spring Framework Descripion"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description")
			);
	
	public List<Topic>  getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id)
	{
	 return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
   }

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}

//Content-Type = application/json
