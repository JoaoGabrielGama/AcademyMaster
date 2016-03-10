package Object.Project;

import java.util.ArrayList;
import Object.User.User;
import Post.Post;

public class InPreparation extends Project{



	public InPreparation(String start, String name, String end, String funding, String fund, String objective,
			String info, ArrayList<User> user, ArrayList<Post> posts) {
		super(start, name, end, funding, fund, objective, info, user, posts);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "In Preparation";
	}

}
