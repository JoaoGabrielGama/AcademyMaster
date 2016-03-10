package Object.Project;

import java.util.ArrayList;
import Object.User.User;
import Post.Post;

public class Completed extends Project {
	public Completed(String start, String name, String end, String funding, String fund, String objective, String info,
			ArrayList<User> participants, ArrayList<Post> posts) {
		super(start, name, end, funding, fund, objective, info, participants, posts);
		// TODO Auto-generated constructor stub
	}

	private int teacherId;


	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "Completed";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

}
