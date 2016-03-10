package Object.Project;

import java.util.ArrayList;
import Object.User.User;
import Post.Post;

public class InProcess extends Project {




	public InProcess(String name, String start, String end, String funding, String fund, String objective, String info,
			ArrayList<User> participants, ArrayList<Post> posts) {
		super(name, start, end, funding, fund, objective, info, participants, posts);
		// TODO Auto-generated constructor stub
	}

	private int teacherId;



	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "In Process";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

}
