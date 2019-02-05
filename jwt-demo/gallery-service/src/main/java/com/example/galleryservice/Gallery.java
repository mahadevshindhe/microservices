package com.example.galleryservice;

import java.util.List;

public class Gallery {

	private int id;
	private List<Object> images;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setImages(List<Object> images) {
		this.images = images;

	}

	public List<Object> getImages() {
		return images;
	}

}
