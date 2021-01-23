package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.TouristPlace;

public class ListOperations {
	List<TouristPlace> bucketList = new ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places) {
		bucketList.add(places);
		return bucketList;
	}
	public List<TouristPlace> remove(TouristPlace places) {
		bucketList.remove(places);
		return bucketList;
	}
	public Object sortByDestination(List<TouristPlace> places) {
		ArrayList<TouristPlace> slist=new ArrayList<TouristPlace>();
		slist.sort((TouristPlace placeA,TouristPlace placeB) -> placeA.getDestination().compareTo(placeB.getDestination()));
		return places;
	}
	public Object sortByRank(List<TouristPlace> places) {
		ArrayList<TouristPlace> slist=new ArrayList<TouristPlace>();
		slist.sort((TouristPlace placeA,TouristPlace placeB) -> placeA.getRank().compareTo(placeB.getRank()));
		return places;
	}
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}

