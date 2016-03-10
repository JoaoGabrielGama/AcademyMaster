package Post;

public class Post {
	private int idAuthor;
	private int idProject;
	private String content;

	public Post(int idAuthor, int idProject, String date, String name) {
		super();
		this.idAuthor = idAuthor;
		this.idProject = idProject;
		this.content = date + " - " + name;
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
 
}
