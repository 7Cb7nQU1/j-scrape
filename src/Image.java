public class Image {
	private Link uri;
	private String title;

	public Image(Link u) {
		this.uri = u;
	}
	public void download() {
		// TODO Go through Imgur API to download image
	}
	public void setTitle(String t) { this.title = t; }
	public Link getUri() { return this.uri; }
}
