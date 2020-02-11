package capgemini.secondproject.library;

public abstract class MediaItem extends Item{
	int MusicCDISBN, VISBN;
	String MusicCDGenre, VGenre;
	
	public abstract void MusicCDRate();
	
	public abstract void VideoQuality();

	@Override
	public void Show() {
		
	}

	public int getMusicCDISBN() {
		return MusicCDISBN;
	}

	public void setMusicCDISBN(int musicCDISBN) {
		MusicCDISBN = musicCDISBN;
	}

	public String getMusicCDGenre() {
		return MusicCDGenre;
	}

	public void setMusicCDGenre(String musicCDGenre) {
		MusicCDGenre = musicCDGenre;
	}

	public int getVISBN() {
		return VISBN;
	}

	public void setVISBN(int vISBN) {
		VISBN = vISBN;
	}

	public String getVGenre() {
		return VGenre;
	}

	public void setVGenre(String vGenre) {
		VGenre = vGenre;
	}
	
}
