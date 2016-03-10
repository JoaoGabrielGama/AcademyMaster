package Builder;

import Object.Project.Project;
import Object.Project.Builder.BuilderProject;
import Object.User.User;
import Object.User.Builder.BuilderUser;

public class Builder {
	public User buildUser(int id) {
		BuilderUser builderUser = new BuilderUser();
		return builderUser.get(id);
	}

	public Project buildProject(int id) {
		BuilderProject builderProject = new BuilderProject();
		return builderProject.get(id);
	}
}
