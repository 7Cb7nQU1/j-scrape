public class Link {
	private String uri;

	public Link(String l) { this.uri = l; }
	public String get() { return this.uri; }
	public boolean isImgur() {
		return false; // TODO
	}
	public boolean isAlbum() {
		if (this.isImgur()) {
			return false; // TODO
		} else {
			return false;
		}
	}
	public boolean download(String dir) {	// TODO
		boolean success = false;
		return success;
	}
}
