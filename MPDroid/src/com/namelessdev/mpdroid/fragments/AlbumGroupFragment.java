package com.namelessdev.mpdroid.fragments;

import org.a0z.mpd.Artist;
import org.a0z.mpd.Item;

import com.namelessdev.mpdroid.tools.AlbumGroup;

public class AlbumGroupFragment extends AlbumsFragment {
	protected AlbumGroup group = null;

	public AlbumGroupFragment() {
		super();
	}
	
	public AlbumGroupFragment init(Artist a, AlbumGroup g) {
		artist = a;
		group = g;
		return this;
	}

	@Override
	protected Item lookup(int position)
	{
		return group.get(position);
	}
	
	@Override
	protected void asyncUpdate() {
		items = group.albums();
	}
}
