package fis.topic03.practice02;

import java.util.Objects;

public class DataChatBot {
	public String cauhoi;
    public String luachon;
    public String key;
    
    
	public String getCauhoi() {
		return cauhoi;
	}


	public void setCauhoi(String cauhoi) {
		this.cauhoi = cauhoi;
	}


	public String getLuachon() {
		return luachon;
	}


	public void setLuachon(String luachon) {
		this.luachon = luachon;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public DataChatBot(String cauhoi, String luachon, String key) {
		super();
		this.cauhoi = cauhoi;
		this.luachon = luachon;
		this.key = key;
	}


	public DataChatBot(String cauhoi, String luachon) {
		super();
		this.cauhoi = cauhoi;
		this.luachon = luachon;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cauhoi, key, luachon);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataChatBot other = (DataChatBot) obj;
		return Objects.equals(cauhoi, other.cauhoi) && Objects.equals(key, other.key)
				&& Objects.equals(luachon, other.luachon);
	}


	@Override
	public String toString() {
		return ""+ luachon + "\n Bạn muốn\t" + key + "";
	}

}
