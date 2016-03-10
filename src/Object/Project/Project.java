package Object.Project;

import java.util.ArrayList;
import Object.User.User;
import Post.Post;

public abstract class Project {
	private int id;
	private String start;
	private String name;
	private String end;
	private String funding;
	private String fund;
	private String objective;
	private String info;
	private ArrayList<User> participants;
	
	public Project(String name, String start, String end, String funding, String fund2, String objective, String info,
			ArrayList<User> participants, ArrayList<Post> posts) {
		super();
		this.setName(name);
		this.start = start;
		this.end = end;
		this.funding = funding;
		this.fund = fund2;
		this.objective = objective;
		this.info = info;
		this.participants = participants;
	}

	public abstract String state();

	public void add(User user) {
		participants.add(user);
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public ArrayList<User> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<User> participants) {
		this.participants = participants;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
